(ns car-challenge)
;; A car dealership has three different car models with the following prices:
;; BMW 60.000
;; FERRARI 100.000
;; FIAT 20.000
;;
;; The dealership is also running a discount coupon for 20% off the car's price
;;
;; Create a function that takes in a coupon code and the customer's budget, validates the coupon code,
;; applies the discount, if valid, and returns the available cars for that value.
;;
;; Samples:

;; Input: ("valid" 50.000)
;; Output: "The Coupon is valid"
;;          BMW 48.000
;;          FIAT 16.000


;; Input: ("invalid" 50.000)
;; Output: "The Coupon is invalid"
;;          FIAT 20.000


(def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})

(defn ApplyDiscount
  "Applies a discount % over the provided value"
  [discount value]
  (int (Math/ceil (- value (* (float (/ discount 100)) value))))
)

(defn ValidateCoupon
  "Checks if the coupon code is valid"
  [couponCode]
  (if (= couponCode "valid")
    (do
      (println "The coupon is valid")
      20)
    (do
      (println "The coupon is invalid")
      0)
    )
)

(defn GetCarListInBudget
  "Returns a list of cars that are within the provided budget, after applying the discount coupon."
  [couponCode budget]
  (def discountAmount (ValidateCoupon couponCode))
  (doseq [car cars]
    (def carName (first car))
    (def newCarValue (ApplyDiscount discountAmount (last car)))

    (if (<= newCarValue budget)
      (println "The car" (clojure.string/upper-case carName) "costs" newCarValue)
      )
    )
  )


(GetCarListInBudget "valid" 19999)
