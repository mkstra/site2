(ns site2.app
  (:require
    [reagent.core :as reagent :refer [atom]]
    [reagent.dom :as rdom]
    [reagent.session :as session]
    [site2.util :refer [nav roamdata parse-to-hiccup]]
    [json-html.core :refer [json->hiccup]]
    ;[instaparse.core :as insta]
))

(defonce app-state (atom {:title "WhichWeather"                          ;; <1>
                          :postal-code ""
                          :json roamdata
                          :data-received? false }))
;; -------------------------
;; Page mounting component

(defn to-json [v] (.stringify js/JSON v))

(defn download-object-as-json [value export-name]
  (let [data-blob (js/Blob. #js [(to-json value)] #js {:type "application/json"})
        link (.createElement js/document "a")]
    (set! (.-href link) (.createObjectURL js/URL data-blob))
    (.setAttribute link "download" export-name)
    (.appendChild (.-body js/document) link)
    (.click link)
    (.removeChild (.-body js/document) link)))

(-> (.fetch js/window "http://localhost:8080")
    #_=>   (.then #(.json %))  ; Get JSON from the Response.body ReadableStream
    #_=>   (.then #((swap! app-state
                           assoc-in [:json] (js->clj % :keywordize-keys true )) %))
            ;(.then (download-object-as-json (clj->js {:hello "world"}) "myfile.json"))
    )

;filter ROAM JSON: get node + children with tag "X" and all the referenced nodes + their references
(def pages
  {:about "/about"
   :contact "/contact"
   }
  )

(defn app []
  [:div
   (nav pages)
   
   [:p
    "  This illustrates the intimate relationship between power laws and 
     [[fractal]]s. Power law distributions, as we saw in chapter 15, 
     figure 15.6, are [[fractal]]s—they are self-similar at all scales of magnification, and a power-law’s exponent gives the dimension of the corresponding [[fractal]]
     [:span {:class \"block-ref\"} \"cells in most organisms
     have hundreds of different metabolic pathways, many 
     interconnecting, forming networks of metabolic reactions. Albert-László Barabási and colleagues looked in detail at the structure of metabolic networks in forty-three different organisms and found that they all were “well fitted” by a power-law distribution—i.e., are scale free. \"]"]
   
   [:span 555 [:span 333]]
   [:p  "I'm jesus" [:span " yees you are"]]
   ;(map parse-block (map :string roamdata))
   [:div {:class "with-sidebar"}
    [:div
     [:div {:class "main"} [:article (map parse-to-hiccup (filter :title (get-in @app-state [:json]))) ] ]

     ;[:div {:class "main"} (map (partial parsenode 0) (filter :title (get-in @app-state [:json])))]
      ;[:div {:class "main"} (map (fn [x] [:p (:string x)]) (get-in @app-state [:json :children] ))]
     [:div {:class "sidebar"} "Sidebar"]]]
   [:div {:class "yell"} "YOOOOOZOOO"]]
  )

