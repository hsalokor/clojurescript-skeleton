(ns test.skeleton.main
  (:use [litmus.assert :only [equals? =>]])
  (:use-macros [litmus.macros :only [describe it]]))

(describe "A test"
  (it "should pass"
    (equals? true => true)))
