gauges-clj
==========

A client library for Gaug.es.

Install
-------

Available from Clojars:

    [gauges-clj "0.1.0"]

Usage
-----

``` clojure
(ns your-app
    (:require [gauges-clj.core :as g]))

(def gauge {:api-key "<your Gaug.es API key here"
            :gauge-id "<your Gauge ID here"})

(g/get-traffic gauge)
=> {}

(g/get-traffic gauge {:page 2})
=> {}

(g/get-traffic gauge {:date "2013-01-22"})
=> {}
```

License
-------

BSD, short and sweet
