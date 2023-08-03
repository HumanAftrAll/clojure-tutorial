(ns macros)
;; A macro is basically the language sugarcoating

(macroexpand-1 '(when (= 2 2) (println "Hello")))
;; => (if (= 2 2) (do (println "Hello")))
;; "when" is a macro for (if)