(ns myeti.utils.common)

(def greetings ["greetings"
                "hi"
                "howdy"
                "welcome"
                "bonjour"
                "good day"])

(defn greeting
  "return a greeting"
  ([]
   (let [items (- (count greetings) 1)]
     (greeting (rand-int items))))
  ([seed]
   (nth greetings seed)))

(comment
  
  (greeting)
  (greeting 0)
  
  )