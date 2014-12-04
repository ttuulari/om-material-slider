(ns slider.core
  (:require
    [om.core :as om :include-macros true]
    [om.dom :as dom :include-macros true])
  (:use [jayq.core :only [$]]))

(defn on-slide [elem owner data]
  "Add slide event handling here, e.g. core.async channel put!."
  true)

(defn draw [opts owner app]
  (let [element (om/get-node owner)
        $elem   ($ element)]
    (.noUiSlider $elem (clj->js (:slider opts)) true)
    (.on $elem "slide" (fn [] (on-slide $elem owner app)))))

(defn slider-view [app owner opts]
  (reify
    om/IDidMount
    (did-mount [this]
      (draw opts owner app))

    om/IDidUpdate
    (did-update [this prev-props prev-state]
      (draw opts owner app))

    om/IRenderState
    (render-state [this state]
      (dom/div (clj->js (:js opts))))))
