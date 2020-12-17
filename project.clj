(defproject aoc "0.1.0-SNAPSHOT"
  :description "Advent of Code 2020 Solutions"
  :url "https://adventofcode.com"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/math.combinatorics "0.1.6"]]
  :repl-options {:init-ns aoc.core}
  :main aoc.core)
