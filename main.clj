(defn dog-age [age]
  (* age 7))

(defn greet [name age]
  (str "Hello " name " you would be " (dog-age age) " if you were a dog!"))

(println (greet "Andy" 19))