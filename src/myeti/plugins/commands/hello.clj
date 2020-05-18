(ns myeti.plugins.commands.hello
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [myeti.utils.common :refer [greeting]]
   [clojure.string :refer [capitalize]]
   [taoensso.timbre :refer [debug]]))

(defn- capitalize-random-greeting
  "returns a capitalized greeting"
  []
  (let [crg (capitalize (greeting))]
    (debug "capitalized greeting:" crg)
    crg))

(defn hello-cmd
  "hello # say hello to the bot"
  [_]
  (str (capitalize-random-greeting))
       ". How can I help you today?")

(cmd-hook #"hello"
          _ hello-cmd)

(comment
  
  (hello-cmd "")
  
  )