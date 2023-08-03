(ns watchers)

;; A watcher triggers a function whenever the value of a given atom/state is changed

(defn Watch
  []
  (def x (atom 5))
  (add-watch x :xWatcher
             (fn [key atom old-state new-state]
               (println key)
               (println atom)
               (println old-state)
               (println new-state)
               ))
  (reset! x 10)                                             ;; Watcher triggered
  (remove-watch x :xWatcher)                                ;; Watcher removed
  (reset! x 15)                                             ;; Watcher not triggered
  )

(Watch)
