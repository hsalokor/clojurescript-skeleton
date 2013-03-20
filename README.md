# clojurescript-skeleton

Simple clojurescript skeleton.

## Usage

First, run server:

    lein run

On another terminal, set up cljs autocompile

    lein cljsbuild auto

Navigate to URL http://localhost:3000/ and click on the text 'Lol'. Ta-da.

# Running tests

First, you need to install

* NPM (Node package manager)
* Node.js
* Phantomjs (1.8+)

After these are installed, install mocha-phantomjs

    npm install -g mocha-phantomjs

Run tests

    lein test

## License

Copyright © 2012 Harri Salokorpi

Distributed under the Eclipse Public License, the same as Clojure.
