package com.example.project_tms

enum class Enum {
    fixAmount,
    rangeAmount;

    override fun toString():String {
        return when(this){
            fixAmount -> "Fix"
            rangeAmount -> "Range"
        }
    }
}