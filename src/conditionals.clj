(ns conditionals)



(defn CondIf
  []
  (println "\nCondIf:")
  (if (= 5 4)
    (println "Equal")
    (println "Not Equal")))

(CondIf)

(defn CondIfDo
  []
  (println "\nCondIfDo:")
  (if (= 5 (+ 2 1))
    (do
      (println "Equal 1")
      (println "Equal 2"))
    (do
      (println "Not Equal 1")
      (println "Not Equal 2"))
    ))

(CondIfDo)


(defn NestedIf
  []
  (println "\nNestedIf:")
  (if (and (and (= 5 5) (= 3 3)) (= 5 5))
    (println "True")
    (println "False")
    ))

(NestedIf)

(defn CondCase
  [pet]
  (println "\nCondCase:")
  (case pet
    "dog" (println "I have a dog")
    "cat" (println "I have a cat")
    "goldfish" (println "I have a goldfish")
    (println "IDK what pet I have"))
  )

(CondCase "cat")

(defn CondCond
  [amount]
  (println "\nCondCond:")
  (cond
    (<= amount 2 ) (println "Few")
    (<= amount 5 ) (println "Several")
    (<= amount 10 ) (println "Many")
    :else (println "Loads")
    )
  )

(CondCond 20)

















