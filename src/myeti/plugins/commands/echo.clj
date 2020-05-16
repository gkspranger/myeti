(ns myeti.plugins.commands.echo
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]))

(defn echo-cmd
  "echo <text> # repeat what was said"
  [{[_ match] :match}]
  (str match))

(cmd-hook #"echo"
          #"(.+)" echo-cmd)

(comment
  
  (echo-cmd {:match "hello"}) 
  
  )