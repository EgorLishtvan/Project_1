package com.example.project_tms

import java.lang.ArithmeticException

data class Discount(
    var title: String,
    var descriptin: String,
    var url: String? = null,
    var amount: Int? = null,
    var type: Type
) {

    fun setMyAmount(value: Int?) {
        amount = try {
            if (value != null) {
                1 / value
            } else {
                0
            }
        } catch (exception: ArithmeticException) {
            -1
        }
    }

    fun setMyDiscription(value: String) {
        title = if (value.length <= 100) {
            value
        } else {
            value.substring(0..100)
        }
    }

    fun getSafeUrl(): String {
        return url ?: "Google.com"
    }

    fun temp(url: String?): String {
        return url ?: "Google.com"
    }
}

fun main() {
    val discount = Discount("Cat", "The best", "jhdf", 646, Type.fixAmount(6))
    println(discount)
    discount.type = Type.NoDiscount
    println(discount.type.calculate(5))
    discount.type = Type.fixAmount(5)
    println(discount.type.calculate(5))
    discount.type = Type.rangeAmount(5,6)
    println(discount.type.calculate(5))
}