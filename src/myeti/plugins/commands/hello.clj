(ns myeti.plugins.commands.hello
  (:require
   [yetibot.core.hooks :refer [cmd-hook]]
   [clojure.tools.cli :refer [parse-opts]]
   [clojure.string :refer [split]]))

(def cli-options
  [["-n" "--name NAME"]
   ["-p" "--likes-pizza"]])

(defn hello-cmd
  "hello # say hello
   
   React to a person's name, if present:
   -n --name <name>
   
   Determine if the user likes pizza:
   -p --likes-pizza"
  [{:keys [match]}]
  (let [{options :options} (parse-opts (split match #" ") cli-options)
        greeting (if (:name options)
                   (str "Hello " (:name options) "!")
                   "Greetings.")
        pizza-chat (if (:likes-pizza options)
                     "I hear you like pizza? Me too!"
                     "How can you not like pizza?")]
    (str greeting " " pizza-chat)))

(cmd-hook #"hello"
          _ hello-cmd)

(comment
  
  (parse-opts ["-n" "greg"] cli-options)
  (parse-opts ["-p"] cli-options)
  
  (:name {:name "greg"})
  (:name {:age 45})
  
  )