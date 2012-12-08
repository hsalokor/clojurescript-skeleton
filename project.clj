(defproject clojurescript-skeleton "0.1.0-SNAPSHOT"
  :description "Clojure and Clojurescript skeleton"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [compojure "1.1.3"]
                 [midje "1.5-alpha1"]

                 [jayq "0.3.2"]
                 [crate "0.2.2"]]
  :plugins [[lein-ring "0.7.5"]
            [lein-cljsbuild "0.2.9"]
            [lein-midje "2.0.3"]]
  :source-paths ["src/clj"]
  :ring {:handler skeleton.main/app})
