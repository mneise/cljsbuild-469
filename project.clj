(defproject cljsbuild-469 "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.339"]
                 [fipp "0.6.6"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild {:builds [{:id "js"
                        :source-paths ["src"]
                        :compiler {:output-to "target/test.js"
                                   :output-dir "target/js"
                                   :optimizations :advanced}}]})
