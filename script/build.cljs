(ns build.core
  (:require [markdown.core :refer [md->html]]
            [planck.core :refer [slurp spit]]
            [planck.shell :refer [sh]]))

(def src "src/")
(def target "target/")
(def public (str target "public/"))

(def preamble (slurp (str src "preamble.html")))
(def postamble (slurp (str src "postamble.html")))

(defn wrap-html
  [body]
  (str preamble body postamble))

(defn md-to-html
  [in out]
  (spit out
    (wrap-html
      (md->html (slurp in)))))

(defn process-md
  [in]
  (md-to-html
    (str src in) (str public (subs in 0 (- (count in) 2)) "html")))

(sh "mkdir" "-p" target)
(sh "rm" "-rf" public)
(sh "mkdir" "-p" public)

(process-md "index.md")
(process-md "roadmap.md")

(sh "cp" "-r" (str src "img") public)
(sh "cp" "-r" (str src "css") public)
