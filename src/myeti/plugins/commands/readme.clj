(ns myeti.plugins.commands.readme
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [clj-http.client :as client]
   [clojure.pprint :refer [pprint]]))

(defn readme-cmd
  "readme # show myeti's readme"
  [_]
  (def readme (client/get "https://raw.githubusercontent.com/gkspranger/myeti/master/readme.md"))
  (pprint readme)
  (str (readme :body)))

(cmd-hook #"readme"
          _ readme-cmd)

(comment
  
  (readme-cmd "")
  
  )