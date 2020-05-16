(ns myeti.plugins.commands.template
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [clojure.core.strint :refer [<<]]))

(def greeting {:when "today"})

(defn template-cmd
  "template <text> # an example of using a template"
  [{[_ match] :match}]
  (<< 
"Hello ~{match},
I hope you are doing well ~(->> greeting :when).
This is my 3rd line."))

(cmd-hook #"template"
          #"\s*(.+)" template-cmd)

(comment
  
  (template-cmd {:match [0 "Greg"]})

  )