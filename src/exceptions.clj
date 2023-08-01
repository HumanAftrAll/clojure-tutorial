(ns exceptions)

(defn ExHandling
  [x]
  (try
     (inc x)
     (println "Successfully executed!")
     (catch ClassCastException e
       (println "Caught a ClassCastException:" (.getMessage e))
       )
     (catch Exception e
       (println "Caught an Exception" (.getMessage e)))
     (finally
       (println "And then this happened"))
   )

)

(ExHandling 1)
