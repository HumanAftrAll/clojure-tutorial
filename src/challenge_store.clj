;; A seller is selling the following items:
;;    Pen      - $1
;;    Notebook - $5
;;    Backpack - $10

;; Two different bank account, one for the seller and another for the buyer, also exist within the challenge:
;; Seller Account   - $0      funds
;; Buyer Account    - $100    funds

;; A function must be crated that:
;; 1) Purchases an item from the seller to the buyer
;; 2) Is able to be called multiple times
;; 3) Allows for the purchase of multiple items at once

(ns challenge-store)

(def itemList {"pen" 1, "notebook" 5, "backpack" 10})

(defn main
  "docstring"
  []
  (def amount (atom 0))
  (doseq [item itemList]
    (reset! amount (+ (last item) @amount))
    )
  (println @amount)
  )

(main)


(def buyerItemList [])




