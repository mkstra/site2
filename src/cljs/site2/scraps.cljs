
(ns site2.parsing)

(defn split-by [pred coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (let [!pred (complement pred)
           [xs ys] (split-with !pred s)]
       (if (seq xs)
         (cons xs (split-by pred ys))
         (let [skip (take-while pred s)
               others (drop-while pred s)
               [xs ys] (split-with !pred others)]
           (cons (concat skip xs)
                 (split-by pred ys))))))))
(def code-suffix "::")
(def delimiters ["(())" "[[]]"])

(defn split-by-whitespace [s]
  (clojure.string/split s #"\s+"))


(defn get-public-node [root]
  ;extract public nodes for ((UID)) references 2) extract ((uid))s 3) filter
  [])

;(defn resolve-block [uid] :string (get-public-node uid))
; rawroamtext -> intermediate -> parsedHiccup ->
(defn hastag? [tag]
  ;checks if a child has a #tag like #public ... to be able to link it
  )

;Footnote -> sup sub
;* Bla <1> ioapd
; *<1>
;    *Ladida
;(defn links)
;(defn find-backlinks [uid] [])
;(defn get-node [uid] [])
;(def attributes {
;                 :url
;                 :title
;                 :def
;                 :essay
;                 :formula
;                 :iframe-src
;                 :certainty
; :prediction
;                 :src
;                 :tweet-src
;                 :similar
;            :claim
;            :is-a
;            :synonym
;                 :footnote
;
;            })




                   ;; ^{:key item} is for react indexing


(def with-sidebar {:display "flex"
                   :flex-wrap "wrap"
                   :margin "-0.5rem"
                   :border "green"
                   :min-width "95vw"
                   })


(def sidebar {
              :flex-basis "10rem";
              ;:margin-left "3rem"
              :flex-grow 1;
              :background "red";
              })

(def main {
           :flex-basis 0;
           :flex-grow 999;
           :min-width "calc(50% - 1rem)"
           :background "blue"; /* enable grow, disable shrink */
           })
;(get-in @app-state [:json :children]))
;(lister (range 3))
;[nav pages]
;
;
;(json->hiccup (get-in @app-state [:json]))
;
;