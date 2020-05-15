(ns myeti.plugins.commands.echo
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]))

(defn echo-cmd
  "echo <text> # Echos back <text> as a string. Useful for piping."
  [{[arg] :match}]
  (str arg))

(cmd-hook #"echo"
          #"(.+)" echo-cmd)