(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divisible-by? [number divisor]
	(zero? (mod number divisor))
)

(defn fizzbuzz [number]
	(if(divisible-by? number 3) "fizz")
	(if(divisible-by? number 5) "buzz")
	(if(divisible-by? number 15) "fizzbuzz")
	number
)
