(ns petstore)

(defn petToHumanAgeRatio
  "This Function returns the ratio of a pet's age years vs human years"
  [petType]
  (def petStore {'dog 7, 'cat 5, 'goldfish 10})
  (get petStore petType))

(defn petAgeInHumanYears
  "This fn returns a given pet's age in human years"
  [petType petAge]
  (def ratio (petToHumanAgeRatio petType))
  (* ratio petAge))

(println "My dog is" (petAgeInHumanYears 'dog 7) "years old")
(println "My cat is" (petAgeInHumanYears 'cat 5) "years old")
(println "My goldfish is" (petAgeInHumanYears 'goldfish 2) "years old")