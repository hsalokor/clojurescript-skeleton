(ns skeleton.main
  (:use [jayq.core :only [$ on]])
  (:use-macros [jayq.macros :only [ready]]))

(defn- alert []
  (js/alert "Hello world!"))

(ready
  (on ($ "#lol") "click" alert))
