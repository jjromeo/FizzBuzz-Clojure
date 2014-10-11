(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
	(testing "it returns true for 3"
		(is (= true (divisible-by-three? 3)))

	)
)

(deftest is-not-divisible-by-three
	(testing "it returns false for 1"
		(is (= false (divisible-by-three? 1)))

	)
)