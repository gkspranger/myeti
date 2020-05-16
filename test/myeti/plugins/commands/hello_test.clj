(ns myeti.plugins.commands.hello-test
  (:require [clojure.test :refer :all]
            [myeti.plugins.commands.hello :as hello]))

(deftest hello-cmd-test
  (is (clojure.string/includes?
       (hello/hello-cmd "")
       "How can I help you today")))
