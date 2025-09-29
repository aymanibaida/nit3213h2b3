package com.example.mynit32132b3

fun main(){

    var firstword:String="Hello"
    val secondword: String="second"
    var age : Double = 24.0
    val personalfincalculater=PersonalFinanceCalculator(10000.0,0.10)

    println("The calculated monthly payment is ${personalfincalculater.monthlyPayment}")


    var i=10
    //prints nothing
    while(i<10){
        println("$i")
        i++
    }

    //print only once
    do{
        println("$i")
        i++
    } while(i<10)

    //print the numbers from 1 to 10
    for (i in 1..10){
        println("$i")
    }

    var car=Car("Tesla","Red")

    var toyotacamry=Toyota("Camry","Blue")

    car.showmodel()  //the model of the car is Tesla
    car.showcolor()  //red
    toyotacamry.showmodel() //the model of the car is Toyota Camry
    toyotacamry.showcolor() // blue

var names=mutableListOf<String>("Ayman","secondname","Thirdname")

    names.forEach { name ->
        println("this is the list item $name")

    }


//secondword="World!!!!!"
    //println("the value of firstword is $firstword and the value of secondword is $secondword")
    //println("the value of age is $age")




}