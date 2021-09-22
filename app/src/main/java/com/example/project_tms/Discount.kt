package com.example.project_tms

import java.lang.ArithmeticException

class Discount {
    var title: String = ""
        get() = field.uppercase()

    var descriptin: String? = null
        set(value) {
            field = if (value != null) {
                if(value.length<=100){
                    value
                }else{
                    value.substring(0,100)
                }
            }else{
                value
            }
        }

    var amount:Int? =null
        set(value){
            var field = try {
                if (value != null) {
                    1/value
                } else {
                    0
                }
            } catch (exception: ArithmeticException) {
                0
            }
        }
    var url: String?=""
}

fun main(){
  val Discount=Discount()
    println(Discount)
}