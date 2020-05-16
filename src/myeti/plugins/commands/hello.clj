(ns myeti.plugins.commands.hello
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [myeti.utils.common :refer [greeting]]
   [clojure.string :refer [capitalize]]))

(defn hello-cmd
  "hello # say hello to the bot"
  [_]
  (str (capitalize (greeting))
       ". How can I help you today?"))

(cmd-hook #"hello"
          _ hello-cmd)

(comment
  
  (hello-cmd "")
  
  )