(ns myeti.plugins.commands.template
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [clojure.core.strint :refer [<<]]
   [taoensso.timbre :refer [debug]]))

(defn render
  "returns evaluated template"
  [data]
  (<< 
"Hello ~(->> data :match),
I hope you are doing well ~(->> data :when).
This is my 3rd line."))

(defn template-cmd
  "template <text> # an example of using a template"
  [{[_ match] :match}]
  (debug "captured match:" match)
  (render {:match match, :when "today"}))

(cmd-hook #"template"
          #"\s*(.+)" template-cmd)

(comment
  
  (template-cmd {:match ["" "Greg"]})

  )