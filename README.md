# cljsrn-org

Source for http://cljsrn.org website

# Updating

The source files for the website are in `src`. These are primarily markdown files, along with images, etc.

# Building

If you would like to see what the site would look like with revisions to content in `src` you can build it locally. In order to build the site, [Leiningen](http://leiningen.org) and [Planck](http://planck.fikesfarm.com) are required.

Run `script/build`. This converts the markdown into HTML and places everything into `target/public`.

You can then open `target/public/index.html` in your browser to see what it looks like.

# Contributing

Please submit PRs to this repo to submit content for addition to http://cljsrn.org.

# License

Copyright © 2015–2016 Mike Fikes and Contributors

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.