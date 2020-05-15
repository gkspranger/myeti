(ns myeti.utils.common)

(defn greeting
  "return a greeting"
  []
  (def greetings ["greetings"
                  "hi"
                  "howdy"
                  "welcome"
                  "bonjour"
                  "good day"])
  (rand-nth greetings))

(comment
  
  (greeting)
  
  )