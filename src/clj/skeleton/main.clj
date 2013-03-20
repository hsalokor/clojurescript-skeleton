(ns skeleton.main
  (:gen-class)
  (:use [compojure.route :only [resources not-found]]
        [compojure.handler :only [site]] ; form, query params decode; cookie; session, etc
        [compojure.core :only [defroutes GET POST DELETE ANY context]]
        [ring.util.response :only [redirect]]
        org.httpkit.server))

(defroutes all-routes
  (GET "/" [] (redirect "index.html"))
  (resources "/")
  (not-found "Page not found."))

(defn -main []
  (run-server (site #'all-routes) {:port 3000}))

