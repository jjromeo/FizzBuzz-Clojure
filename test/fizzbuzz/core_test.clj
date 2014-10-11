(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
	(testing "it returns true for 3"
		(is (= true (divisible-by? 3 3)))

	)
)

(deftest is-not-divisible-by-three
	(testing "it returns false for 1"
		(is (= false (divisible-by? 1 3)))

	)
)

(deftest is-divisible-by-five
	(testing "it returns true for 5"
		(is (= true (divisible-by? 5 5)))
	)
)

(deftest is-divisible-by-five
	(testing "it returns false for 1"
		(is (= false (divisible-by? 1 5)))
	)
)

(deftest is-divisible-by-fifteen
	(testing "it returns true for 15"
		(is (= true (divisible-by? 15 15)))
	)
)

(deftest is-divisible-by-fifteen
	(testing "it returns false for 1"
		(is (= false (divisible-by? 1 15)))
	)
)

(deftest fizzbuzzing
	(testing "it returns 'fizz' for 3"
		(is (= "fizz" (fizzbuzz 3)))
	)
)

(deftest fizzbuzzing
	(testing "it returns 'buzz' for 5"
		(is (= "buzz" (fizzbuzz 5)))
	)
)

(deftest fizzbuzzing
	(testing "it returns 'fizzbuzz' for 15"
		(is (= "fizzbuzz" (fizzbuzz 15)))
	)
)

(deftest fizzbuzzing
	(testing "it returns 1 for 1"
		(is (= 1 (fizzbuzz 1)))
	)
)