(ns myeti.utils.common-test
  (:require [clojure.test :refer :all]
            [myeti.utils.common :as common]))

(deftest greeting-test
  (is (= (nth common/greetings 0) (common/greeting 0))))

