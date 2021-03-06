(defproject io.s6/psl "0.1.0-SNAPSHOT"
  :description "Public Suffix List implementation"
  :url "http://screen6.io/opensource/clojure/psl"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :scm :git
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}}
  :dependencies [[clj-http "1.0.1"]
                 [org.clojure/clojure "1.6.0"]])
