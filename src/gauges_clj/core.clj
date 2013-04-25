(ns gauges-clj.core
  (:require [clj-http.client :as client]))

(def host "https://secure.gaug.es/gauges/")

(defn- make-request [url gauge]
  ((client/get url {:headers {"X-Gauges-Token" (gauge :api-key)} 
                   :as :json}) :body))

(defn- api-call-fn [endpoint gauge & args]
  (let [url (str host (gauge :gauge-id) "/" endpoint)]
    (make-request url gauge)))

(def get-content        (partial api-call-fn "content"))
(def get-referrers      (partial api-call-fn "referrers"))
(def get-traffic        (partial api-call-fn "traffic"))
(def get-technology     (partial api-call-fn "technology"))
(def get-search-terms   (partial api-call-fn "terms"))
(def get-search-engines (partial api-call-fn "engines"))
(def get-locations      (partial api-call-fn "locations"))
