(ns myeti.plugins.commands.template-test
  (:require [clojure.test :refer :all]
            [myeti.plugins.commands.template :as template]))

(deftest template-cmd-test
  (let [match {:match [0 "Greg"]}]
    (is (clojure.string/includes?
         (template/template-cmd match)
         "Hello Greg"))
    (is (clojure.string/includes?
         (template/template-cmd match)
         "are doing well today"))))
