(ns myeti.plugins.commands.echo-test
  (:require [clojure.test :refer :all]
            [myeti.plugins.commands.echo :as echo]))

(deftest echo-cmd-test
  (is (= "hello" (echo/echo-cmd {:match ["" "hello"]}))))
