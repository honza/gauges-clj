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
{:people 9,
 :date 2013-04-26,
 :urls {:newer nil,
        :older https://secure.gaug.es/gauges/<your Gauge ID>/traffic?date=2013-03-01},
 :views 563,
 :traffic [{:people 1, :date 2013-04-01, :views 3}
           {:people 3, :date 2013-04-02, :views 55}
           ...
           {:people 0, :date 2013-04-25, :views 0}
           {:people 0, :date 2013-04-26, :views 0}]}

(g/get-traffic gauge {:page 2})
=> {}

(g/get-traffic gauge {:date "2013-01-22"})
=> {}
```

License
-------

BSD, short and sweet
