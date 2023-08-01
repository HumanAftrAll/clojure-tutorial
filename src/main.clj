(def increment (fn [x] (+ 2 x)))


(defn increment_set
  [x]
  (map increment x)
  )