package com.example.project_tms

sealed class Type(val calculate:(Int)->String) {
  data class  fixAmount(val value: Int):Type({
    (it*value).toString()
  })
    data class  rangeAmount(val kstartValue:Int,val endValue: Int):Type({
      ((kstartValue+endValue)/2*it).toString()
    })
    object NoDiscount:Type({
      "Zerro"
    })
}