(ns agents)

;; Agent is a data type - similar to atoms - but they allow changing data asynchronously

(defn Agents
  []
  (def amount (agent 100))                                  ;; Instantiated the Agent
  (println @amount)                                         ;; Printed (=> 100)

  (send amount inc)                                         ;; Sent an "inc" command
  (println @amount)                                         ;; Printed (=> 100) - not updated yet
  (println "Wait a little bit")
  (println @amount)                                         ;; Printed (=> 101) - has already been updated

  (send amount inc)                                         ;; Sent an "inc" command again
  (await-for 1000 amount)                                   ;; Basically Thread.Wait(1000) but tied to (amount)
  (println @amount)                                         ;; Printed (=> 102) - has already been updated

  (println (agent-error amount))                            ;; If more than one thread access the Agent at the same time
                                                            ;; the exception can be obtained here.
)

(Agents)