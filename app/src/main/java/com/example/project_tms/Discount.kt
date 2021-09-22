package com.example.project_tms

class Discount {
    var title: String = ""
        get() = field.uppercase()

    var descriptin: String? = null
    var amount = "df"
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
    var url: String?=""
}
set(value){
    var field = try {
        var value = null
        if (value != null) {
1/value
        }else{
            0
        }

    }  catch(exception:AritimeException){
        0
    }

fun main(){
  val Discount=Discount()
    println(Discount)
}