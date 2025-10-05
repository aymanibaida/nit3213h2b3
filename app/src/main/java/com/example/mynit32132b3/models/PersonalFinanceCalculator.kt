package com.example.mynit32132b3.models

class PersonalFinanceCalculator(
    var income: Double,
    var interestRate: Double
) {


    var monthlyPayment: Double = 0.0
    fun printGreeting() {
        println("Hello, Welcome to Personal Finance Calculator")
    }

    init {
        monthlyPayment = calculateMonthlyPayment(income, interestRate)

    }

    fun calculateMonthlyPayment(income: Double, interestRate: Double): Double {
        return (income * interestRate) / 12
    }

    fun getGradeFromMark(mark: Int): String {
        return when {
            mark >= 80 -> "HD"
            mark >= 70 && mark < 80 -> "D"
            mark >= 60 && mark < 70 -> "C"
            mark >= 50 && mark < 60 -> "P"
            mark < 50 -> "N"
            else -> "Undefined" // For marks not covered by the above, e.g., 81-88
        }
    }
}

data class Person(val name: String, val age: Int)

