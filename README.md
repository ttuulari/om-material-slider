#Om component for noUiSlider and material bootstrap theme based slider.

##Dependencies
    [om "0.7.3"]
    [jayq "2.5.2"]

Material design theme for bootstrap (http://fezvrasta.github.io/bootstrap-material-design/)

##Arguments
You need to pass to your component two input arguments:

###Input app-state
app-state can be used in the on-slide function.

###Options
Om component options (with :opts key) must be a map, having the keys

* :js – javascript attributes of the slider
* :slider – Slider options, see (http://refreshless.com/nouislider/)


##Usage example
    (om/build slider/slider-view
              om-app-state
              {:opts
                {:js       {:className "slider shorf"}
                 :slider   {:start 0
                            :step 1
                            :connect "lower"
                            :range {:min 0
                                    :max 100}}}})


