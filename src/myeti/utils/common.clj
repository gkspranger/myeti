(ns myeti.utils.common)

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
   (nth greetings seed)))

(comment
  
  (greeting)
  (greeting 0)
  
  )