# ClojureScript React Native Roadmap

## Big Themes

### Android Tooling
Ambly currently only works with iOS. [High level design](https://github.com/omcljs/ambly/wiki/Design%3A-Android) exists and work is underway to add support for Android.

### Lib Consumption
Currently, [Ambly](http://cljsrn.org/ambly.html) and [other](https://github.com/nicholaskariniemi/ReactNativeCljs) approaches involve running the React Native packager. 

Some work [has been done](http://blog.fikesfarm.com/posts/2015-07-06-clojurescript-with-react-native.html) with the goal being the capability to directly consume the CommonJS / JSX JavaScript libraries, and this is still an area of open research.

Pushing forward on this may involve sorting out the Facebook’s use of its `@providesModule` module system, along with sorting out a `:foreign-libs` dependency specification. Or, alternatively, perhaps a concatenated dump of the React Native Packager output can be used to produce a ClojureScript-consumable library.

If the React Native packager is no longer needed, this could lead to an approach that has pros and cons.

### Debugging
React Native has a compelling debugging story involving Chrome. Ambly’s remote compilation model is perhaps at odds with this, but perhaps it is worth exploring to see if we can achieve debugging.

### Automatic Loading
Essentially Figwheel. You can kind-of [fake](http://blog.fikesfarm.com/posts/2015-05-30-poor-mans-figwheel-for-ambly.html) Figwheel with Ambly. But it would be nice to have a better story for this important capability.

Perhaps Figwheel can be made to work with React Native’s support for a web-based context (thus simply using websocket), or perhaps Ambly can somehow integrate with or compose with Figwheel. Definitely worth exploring.

Recent news on this front is [figwheel-react-native](https://github.com/decker405/figwheel-react-native).

### ~~Om Next~~
Currently we know React Native can work with Om and Reagent. It would be nice to explore Om Next with React Native, especially given the potential that Om Next has for mobile (a nice story with respect to how you query data on your backend).

_Update: Om Next works and is now included in Natal._

## Minor Stuff

### Production builds
How do we bundle stuff and potentially support `:advanced`.

### Temporary Blank Screen
The current approach with Ambly involves a pattern where React Native is brought up and quickly replaced with an Om component. It would be nice to eliminate this.

### ~~Render Loop~~
There is a `requestAnimationFrame` call that exists in the current Ambly approach. Would be nice to better understand this, its consqeuences, _etc._ Does Om Next play into this?

_Update:  `requestAnimationFrame` is no longer needed and has been removed from Natal._

### Context Injection
With Ambly on iOS, the JavaScriptCore context is injected into React Native in a hacky sort of way. It would be nice to clean this up.
