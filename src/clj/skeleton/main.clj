(ns skeleton.main
  (:gen-class)
  (:use [compojure.route :only [resources not-found]]
        [compojure.handler :only [site]] ; form, query params decode; cookie; session, etc
        [compojure.core :only [defroutes GET POST DELETE ANY context]]
        org.httpkit.server))

(defn show-landing-page [req]
  "lol")

(defroutes all-routes
  (GET "/" [] show-landing-page)
  (resources "/")
  (not-found "Page not found."))

(defn -main []
  (run-server (site #'all-routes) {:port 3000}))

