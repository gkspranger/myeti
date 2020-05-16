(ns myeti.utils.common-test
  (:require [clojure.test :refer :all]
            [myeti.utils.common :as common]))

(deftest greeting-test
  (is (= "greetings" (common/greeting 0))))

