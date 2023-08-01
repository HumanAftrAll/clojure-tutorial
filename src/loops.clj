(ns loops)


(defn Loop
  []
  (println "\nLoop:")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x)))
    ))

(Loop)

(defn DoTimes
  ""
  []
  (println "\nDoTimes:")
  (dotimes [x 10]
    (println x))
  )

(DoTimes)

(defn WhileDo
  ""
  [count]
   (println (format "\nWhileDo %s:" count))
   (def x (atom 0))
   (while (< @x count)
     (do
       (println @x)
       (swap! x inc)))
  )

(WhileDo 15)

(defn DoSeq
  [seq]
  (println "\nDoSeq:")
  (doseq [x seq]
    (println  (inc x)))
)

(DoSeq [6 5 45 7 2])