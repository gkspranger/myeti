(ns myeti.plugins.commands.template
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [taoensso.timbre :refer [debug]]
   [selmer.parser :as parser]))

(defn gen-map
  "generate some map to use in the template"
  [match]
  {:match match
   :myvar "this is an awesome variable"
   :myloop [1 2 3 "done"]
   :mybool true})

(defn template-cmd
  "template <text> # an example of using a template"
  [{[_ match] :match}]
  (debug "captured match:" match)
  (parser/render-file "template.txt"
                      (gen-map match)))

(cmd-hook #"template"
          #"\s*(.+)" template-cmd)

(comment
  
  (template-cmd {:match ["" "Greg"]})

  )