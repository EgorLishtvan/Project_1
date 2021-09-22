package com.example.project_tms

import java.lang.ArithmeticException

data class Discount(
    var title: String,
    var descriptin: String,
    var url: String?,
    var amount: Int? = null,
    val type: Int?
) {

    fun setMyAmount(value: Int?) {
        amount = try {
            if (value != null) {
                1 / value
            } else {
                0
            }
        } catch (exception: ArithmeticException) {
            0
        }
    }

    fun setMyDiscription(value: String) {
        title = if (value.length <= 100) {
            value
        } else {
            value.substring(0, 100)
        }
    }
}

fun main() {
    val Discount = Discount("Cat", "The best", "jhdf",646,4)
    println(Discount)
}