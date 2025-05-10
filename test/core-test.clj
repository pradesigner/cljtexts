(ns cljtexts.core-test
  (:require [clojure.test :refer :all]
            [cljtexts.core :as core]))

(deftest sample-test
  (testing "A basic test example"
    (is (= 4 (+ 2 2)))))

(deftest core-function-test
  (testing "Test a function from core namespace"
    (is (= "Hello, World!" (with-out-str (core/-main))))))
