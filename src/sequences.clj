(ns sequences)

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  (println (cons "yellow" colors))
  (println (cons colors "yellow"))

  (println (conj colors "yellow"))                          ;; sequences grow at the beginning
  (println (conj ["red" "green" "blue"] "yellow"))          ;; vectors grow at the end

  (println (concat colors ["black" "white"]))
  (println (distinct [1 2 3 4 3 2 1]))
  (println (reverse colors))
  (println (first colors))
  (println (rest colors))
  (println (last colors))
  (println (sort colors))
  (println (sort [1 2 3 4 3 2 1 5 7 6]))
  )

(Seq)