(ns site2.util
  (:require [cljs.reader :refer [read-string]]))

(def example [{:s "you" :uid "123"
               :c [{:s "#[[public]]" :uid "124" :c [{:s "NAMME"}]}
                   {:s "HELLOO ((223))" :uid "125"}]}
              {:s "second page" :uid "223" :c [{:s "child 2" :uid "245" :c [{:s "this is me"}]}]}
              {:s "2anda half page" :uid "224" :c [{:s "child 2" :uid "222" :c [{:s "this is me"}]}]}

              {:s "third page" :uid "224" :c [{:s "child 3" :uid "345" :c [{:s "#[[public]]"}]}]}
              {:s "fourth page ((223))" :uid "225"
               :c [{:s "#[[public]]"} {:s "child 4 with ((245))" :uid "445" :c [{:s "yyyy"}]}]}])

(def roamdata [{:string
                "cells in most organisms have hundreds of different metabolic pathways, many interconnecting, forming networks of metabolic reactions. Albert-László Barabási and colleagues looked in detail at the structure of metabolic networks in forty-three different organisms and found that they all were “well fitted” by a power-law distribution—i.e., are scale free. "
                :create-email "strasser.ms@gmail.com"
                :create-time 1590606999019
                :uid "_MGrRoKxi"
                :edit-time 1590606999019
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "A biological [[neuron]] can actually compute a [[XOR]] [[function]]"
                :create-email "strasser.ms@gmail.com"
                :create-time 1586361516499
                :children
                [{:string "#logic #neuroscience"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1586361552017
                  :uid "oxjApppM9"
                  :edit-time 1586361562194
                  :edit-email "strasser.ms@gmail.com"}]
                :uid "aGSplMmjW"
                :edit-time 1587048222268
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "This illustrates the intimate relationship between power laws and [[fractal]]s. Power law distributions, as we saw in chapter 15, figure 15.6, are [[fractal]]s—they are self-similar at all scales of magnification, and a power-law’s exponent gives the dimension of the corresponding [[fractal]] ((_MGrRoKxi))"
                :create-email "strasser.ms@gmail.com"
                :create-time 1590436308465
                :children
                [{:string ""
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592495703812
                  :uid "Lo6QV--M1"
                  :edit-time 1592495703812
                  :edit-email "strasser.ms@gmail.com"}]
                :uid "NN4FriIah"
                :edit-time 1592495703817
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "The take-home message is that fractal structure is one way to generate a power-law distribution; and if you happen to see that some quantity (such as metabolic rate) follows a power-law distribution, then you can hypothesize that there is something about the underlying system that is self-similar or “fractal-like.”"
                :create-email "strasser.ms@gmail.com"
                :create-time 1590436308465
                :uid "s-7b4wHx_"
                :edit-time 1590436308734
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "What Brown, Enquist, and West were doing in the glass-walled conference room all those many weeks and months was developing an intricate mathematical model of the circulatory system as a space-filling [[fractal]]. They adopted the energy-and-time-minimization and constant-terminal-unit-size assumptions given above, and asked, What happens in the model when body mass is scaled up?"
                :create-email "strasser.ms@gmail.com"
                :create-time 1590436308465
                :uid "oYRqP2Gdt"
                :edit-time 1592343111900
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "Others have argued that metabolic scaling theory is oversimplified, that life is too complex and varied to be covered by one overreaching theory, and that positing [[fractal]] structure is by no means the only way to explain the observed power-law distributions. One ecologist put it this way: “The more detail that one knows about the particular physiology involved, the less plausible these explanations become.”"
                :create-email "strasser.ms@gmail.com"
                :create-time 1590436308465
                :uid "w2bxHamUp"
                :edit-time 1592343107413
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "Fractal was a [[less wrong]] way to view scaling than euclidian [[geometry]]"
                :create-email "strasser.ms@gmail.com"
                :create-time 1591293897362
                :uid "W3miO3A3o"
                :edit-time 1592495615827
                :edit-email "strasser.ms@gmail.com"}
               {:string
                "Engines, machines do not use biological innovations, like fractal space filling --scale—> metabolism (RPM == ~heartbeat) scales with volume"
                :create-email "strasser.ms@gmail.com"
                :create-time 1582243748391
                :uid "A1pNAdAWZ"
                :edit-time 1582250887538
                :edit-email "strasser.ms@gmail.com"}
               {:title
                "The Circulatory System as a Space-Filling Fractal"
                :children
                [{:string "#public"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592342794255
                  :uid "9wpzSNTEw"
                  :edit-time 1592342797376
                  :edit-email "strasser.ms@gmail.com"}
                 {:string "((oYRqP2Gdt))"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1590954816783
                  :uid "dvVvyp-OL"
                  :edit-time 1592342830336
                  :edit-email "strasser.ms@gmail.com"}
                 {:string "((W3miO3A3o))"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1590954816783
                  :uid "WoWa6e8Yn"
                  :edit-time 1592342889357
                  :edit-email "strasser.ms@gmail.com"}
                 {:string "((w2bxHamUp))"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592342889353
                  :uid "0VMKtjkYI"
                  :edit-time 1592342923451
                  :edit-email "strasser.ms@gmail.com"}
                 {:string "((A1pNAdAWZ))"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592342923448
                  :uid "Ct_BoGHmK"
                  :edit-time 1592343001337
                  :edit-email "strasser.ms@gmail.com"}
                 {:string "((s-7b4wHx_))"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592343001332
                  :uid "0jJfPK_1G"
                  :edit-time 1592343051555
                  :edit-email "strasser.ms@gmail.com"}
                 {:string "((NN4FriIah))"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592343051549
                  :uid "Hmw-MvXz6"
                  :edit-time 1592484706157
                  :edit-email "strasser.ms@gmail.com"}
                 {:string
                  "((aGSplMmjW)). We thought this required larger system to perform."
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1591044878601
                  :uid "7vTGzEIvN"
                  :edit-time 1592495684302
                  :edit-email "strasser.ms@gmail.com"}]
                :edit-time 1592484813794
                :edit-email "strasser.ms@gmail.com"}
               {:title
                "Complexity Emerges From The Complex, Not The Simple"
                :children
                [{:string
                  "#public #space-filling #complexity #emergent"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1591041432063
                  :uid "ceNITOiNJ"
                  :edit-time 1592485127161
                  :edit-email "strasser.ms@gmail.com"}
                 {:string
                  "When we use better tools to go deeper we find that lower levels of organization are a lot more complex than we’ve been giving them credit for"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1591045321671
                  :children
                  [{:string
                    "A prokaryote can perform, within a prokaryote precarious, complicated metabolic functions"
                    :create-email "strasser.ms@gmail.com"
                    :create-time 1590954816783
                    :uid "9fGIfCa-x"
                    :edit-time 1591045800491
                    :edit-email "strasser.ms@gmail.com"}
                   {:string
                    "A [[cell]] is incredibly complex. Everything’s optimally packed. Nature is [[space-filling]]"
                    :create-email "strasser.ms@gmail.com"
                    :create-time 1592342693832
                    :children
                    [{:string
                      "https://twitter.com/mkstra/status/1267582585829457922"
                      :create-email "strasser.ms@gmail.com"
                      :create-time 1591100417321
                      :children
                      [{:string
                        "This superficially contradicts Gall's Law: \"only simple systems scale\" but the universe compiles differently and has no working memory constraints"
                        :create-email
                        "strasser.ms@gmail.com"
                        :create-time 1591048756741
                        :children
                        [{:string
                          "The tool defines \"simple\".\nThe medium scopes description length."
                          :create-email
                          "strasser.ms@gmail.com"
                          :create-time 1591100493019
                          :uid "zRX_z9J2q"
                          :edit-time 1591100502119
                          :edit-email
                          "strasser.ms@gmail.com"}]
                        :uid "jVhiK_egw"
                        :edit-time 1591100493025
                        :edit-email
                        "strasser.ms@gmail.com"}]
                      :uid "h60blxi0C"
                      :edit-time 1591100430439
                      :edit-email "strasser.ms@gmail.com"}]
                    :uid "nCD4gygdT"
                    :edit-time 1592342693832
                    :edit-email "strasser.ms@gmail.com"}]
                  :uid "Vv6FmKqTw"
                  :edit-time 1591045345715
                  :edit-email "strasser.ms@gmail.com"}
                 {:string ""
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592485007902
                  :uid "omvorm3sj"
                  :edit-time 1592485007902
                  :edit-email "strasser.ms@gmail.com"}]
                :edit-time 1592485004398
                :edit-email "strasser.ms@gmail.com"}
               {:title
                "Why Haven't We Found More Laws of Biology?"
                :children
                [{:string
                  "#public #biology #quantify #biophysics"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1592485456045
                  :uid "Np8fZiVS3"
                  :edit-time 1592485493323
                  :edit-email "strasser.ms@gmail.com"}
                 {:string
                  "[[claim]] 1: physical systems look simpler in [[hindsight]]"
                  :create-email "strasser.ms@gmail.com"
                  :create-time 1591046994051
                  :children
                  [{:string
                    "physical systems by virtue of having had many more hundreds of years to study them, good science, look, to us, now a lot simpler than perhaps they did when these things were first being worked out, right?"
                    :create-email "strasser.ms@gmail.com"
                    :create-time 1590954816783
                    :children
                    [{:string
                      "#claim [[confidence]]: {{[[slider]]}}"
                      :props
                      {:slider {:yolo 3}}
                      :create-email "strasser.ms@gmail.com"
                      :create-time 1591047032940
                      :uid "mGbjSuRsw"
                      :edit-time 1591047047235
                      :edit-email "strasser.ms@gmail.com"}]
                    :uid "dgOdlrARD"
                    :edit-time 1591047002222
                    :edit-email "strasser.ms@gmail.com"}
                   {:string ""
                    :create-email "strasser.ms@gmail.com"
                    :create-time 1591047011067
                    :uid "7Ay4CMlGS"
                    :edit-time 1591047011067
                    :edit-email "strasser.ms@gmail.com"}]
                  :uid "-GXaf0Iy3"
                  :edit-time 1592485500890
                  :edit-email "strasser.ms@gmail.com"}]
                :edit-time 1592485434828
                :edit-email "strasser.ms@gmail.com"}])

(def testnode (nth roamdata 2))
(def tt (:string testnode))

(defn clip [s]
  (subs s 2 (- (count s) 2)))

(defn bracket-gone [word]
  ;improve: test and error safe
  (or 
   (and (string? word) (second (re-find  #"\(([^()]*)\)" word)))
   word))
  
(defn get-ref [word]                                        ;check for nils
  (filter #(= (:uid %) word) roamdata))

(defn p [txt] 
  (into [:p] txt ))

(sort-by :title roamdata)

(defn word-to-ref [word]
  (-> word
      bracket-gone
      get-ref
      first

      :string)
  )

(defn str-split [txt]
  (clojure.string/split txt " ")
  )


  (defn block-hic [txt]
    [:span {:class "block-ref"} txt])



(defn lookup [word]
  (if (word-to-ref word)
    (block-hic (word-to-ref word))
    word))


(defn override-str [txt]
  (-> txt
      str-split
      ;(doto println)
      (#(map lookup %))
      (#(map lookup %))
      (#(interpose " " %))
      (#(into [:p] %))
      ))

  

;refs first so we catch 2nd-order before parsing the pages

;; => #'site2.util/has-brackets


(defn nav [links]
  [:nav
   (for [item links]
     [:a {:href (val item)} (key item)])])

;(defn replace-ref [txt]
  ;(map #(or (get-str %) %) (words txt)))

(defn parse-to-hiccup [node]
  (if (nil? (:children node))
    ;base case
    (override-str (:string node))
    ;else
    [:div (or 
           (and (:title node) [:h1 (:title node)])
           (override-str (:string node))
           )
     (map parse-to-hiccup (:children node))]))
;
(defn has-value [key value]
  "Returns a predicate that tests whether a map contains a specific value"
  (fn [m]
    (= value (m key))))


(comment
  (def testcoll '("aaa"
                 [:span "YOLO"]
                 "Fractal"
                 "was"
                 "a"
                 "[[less"
                 "wrong]]"
                 "way"
                 "to"
                 "view"
                 "scaling"
                 "than"
                 "euclidian"
                 "[[geometry]]"))
  
  (read-string (str [:div 444 [:span {:class "block-ref"} "A B C"]]))
  
  (reduce (fn [accum value]
            (str accum " "
       ;return normal string or the reference in hic str
                 (lookup value)))            
      "" ["Hallo" "wwww" "((w2bxHamUp))"])
  )
