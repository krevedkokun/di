(ns darkleaf.di.tutorial.x-inspect-test
  (:require
   [clojure.test :as t]
   [darkleaf.di.core :as di]))

(defn a []
  :ok)

(defn b [{a `a}]
  :ok)

(defn c [{a   `a
          b   `b
          :or {b :default}}]
  :ok)

(t/deftest ok
  (t/is (= [{:key `c :dependencies {`a :required `b :optional}}
            {:key `a}
            {:key `b :dependencies {`a :required}}]
           (di/inspect `c))))
