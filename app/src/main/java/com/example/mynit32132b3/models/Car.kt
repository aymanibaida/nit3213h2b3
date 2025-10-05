package com.example.mynit32132b3.models

open class Car(var model: String, var color: String) {

    open fun showmodel(){
        println("the model of the car is $model")
    }

    fun showcolor(){
        println("the color of the car is $color")
    }
}

class Toyota(model: String, color: String) : Car(model, color) {

    override fun showmodel(){
        println("the model of the car is Toyota $model")

    }

}
