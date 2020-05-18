(ns myeti.utils.common
  (:require [taoensso.timbre :refer [debug]]))

(def greetings ["greetings"
                "hi"
                "howdy"
                "welcome"
                "bonjour"
                "good day"])

(def greetings-last-index (- (count greetings) 1))

(defn greeting
  "return a greeting"
  ([]
   (greeting (rand-int greetings-last-index)))
  ([seed]
   (let [rand-greeting (nth greetings seed)]
     (debug "returned greeting:" rand-greeting)
     rand-greeting)))

(comment
  
  (greeting)
  (greeting 0)
  
  )