(ns myeti.plugins.commands.template-test
  (:require [clojure.test :refer :all]
            [myeti.plugins.commands.template :as template]))

(deftest template-cmd-test
  (is (clojure.string/includes?
       (template/template-cmd {:match [0 "Greg"]})
       "Hello Greg"))
  (is (clojure.string/includes?
       (template/template-cmd {:match [0 "Greg"]})
       "are doing well today")))

