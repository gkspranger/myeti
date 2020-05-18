(ns myeti.plugins.commands.readme
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [clj-http.client :as client]
   [taoensso.timbre :refer [debug]]))

(defn readme-cmd
  "readme # show myeti's readme"
  [_]
  (let [readme (client/get "https://raw.githubusercontent.com/gkspranger/myeti/master/README.md")]
    (debug "readme body:" (readme :body))
    (str (readme :body))))

(cmd-hook #"readme"
          _ readme-cmd)

(comment
  
  (readme-cmd "")
  
  )