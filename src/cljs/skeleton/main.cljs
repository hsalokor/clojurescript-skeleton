(ns skeleton.main
  (:use [jayq.core :only [$ on]]
        [jayq.util :only [log]])
  (:use-macros [jayq.macros :only [ready]]))

(defn- show-alert []
  (log "Alert called")
  (js/alert "Hello world!"))

(ready
  (on ($ "#divvi") :click show-alert))
