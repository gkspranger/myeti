(defproject myeti "0.1.0-SNAPSHOT"
  :main yetibot.core.init
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [yetibot/core "20200506.175620.6cd5d91"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
