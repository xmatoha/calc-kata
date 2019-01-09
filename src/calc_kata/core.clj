(ns calc-kata.core
  (:gen-class))



(defn main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(require '[clojure.string :as str])


(defn tokenize [stringToCalc]
  (str/split stringToCalc #","))


(defn calc [stringToCalc]
  (def tokens (tokenize stringToCalc))
  (print tokens)
)
