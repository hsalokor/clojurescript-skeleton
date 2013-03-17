(defproject clojurescript-skeleton "0.1.0-SNAPSHOT"
  :description "Clojure and Clojurescript skeleton"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [http-kit "2.0.0-RC4"]
                 [midje "1.5.0"]

                 ; Clojurescript
                 [jayq "2.3.0"]
                 [prismatic/dommy "0.0.2"]
                 [litmus "0.0.3"]]
  :plugins [[lein-cljsbuild "0.3.1"]
            [lein-midje "3.0.0"]]
  :aot [skeleton.main]
  :source-paths ["src/clj"]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {:test-commands {"unit" ["mocha-phantomjs" "resources/public/test/test.html"]}
              :builds {:dev {:source-paths ["src/cljs"]
                             :compiler {:output-to "resources/public/js/skeleton.js"
                                        :optimizations :whitespace
                                        :externs ["src/cljs/externs/jquery-1.8.js"]
                                        :pretty-print true}}
                       :test {:source-paths ["src/cljs"
                                             "test/cljs/"]
                              :compiler {:output-to "resources/public/test/js/tests.js"
                                         :optimizations :whitespace
                                         :externs ["src/cljs/externs/jquery-1.8.js"]
                                         :pretty-print true}}}}
  :main skeleton.main)
