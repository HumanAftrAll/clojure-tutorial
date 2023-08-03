(ns references)
;; References are similar to Atoms and Agents, but they will only allow for coordinated changes, I.E. transactions
;; A transaction is a set of operations performed against a data type where either all operations succeed or none
;; of the operations succeed - A transaction ensures that happens.

(defn Refs
  []
  (def amount (ref 100))
  (println @amount)

  (dosync
    (ref-set amount 110)

    )
  (println @amount)
  (dosync
    (alter amount inc)
    )
  (println @amount)
  )

(Refs)