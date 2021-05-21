(ns myeti.plugins.commands.test
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]))

(defn test-cmd
  "test # this is a test"
  [_]
  "this is a test")

(cmd-hook #"test"
          #"(.+)" test-cmd)
