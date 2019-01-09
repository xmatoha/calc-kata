(ns calc-kata.core-test
  (:require [clojure.test :refer :all]
            [calc-kata.core :refer :all]))

(deftest validate-tokenizer
  (testing "validate tokenizer"
    (is (= ["1" "2" "3" "4"] (tokenize "1,2,3,4")))))




(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))
