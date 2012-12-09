(ns skeleton.main
  (:gen-class)
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [aleph.http :as aleph]))

(defroutes main-routes
  (route/resources "/")
  (route/not-found "Page not found"))

(defn -main []
  (-> (handler/site main-routes)
      (aleph/wrap-ring-handler)
      (aleph/start-http-server {:port 3000})))