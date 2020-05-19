(defproject myeti "0.1.0-SNAPSHOT"
  :main yetibot.core.init
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [yetibot/core "20200506.175620.6cd5d91"]
                 [com.taoensso/timbre "4.10.0"]
                 [clj-http "3.10.1"]
                 [selmer "1.12.23"]]
  :repl-options {:init-ns yetibot.core.repl
                 :timeout 120000}
  :resource-paths ["resources"]
  :target-path "target/%s"
  :profiles {:dev [{:source-paths ["dev"]
                    :plugins [[lein-midje "3.2.1"]]
                    :dependencies [[lilactown/punk-adapter-jvm "0.0.10"]
                                   [lambdaisland/kaocha-midje "0.0-5"
                                    :exclusions [midje/midje]]
                                   [org.clojure/tools.trace "0.7.9"]
                                   [midje "1.9.9"]]}]
             :test {:dependencies []}
             :uberjar {:uberjar-name "yetibot.jar"
                       :jvm-opts ["-server"]
                       :aot :all}})