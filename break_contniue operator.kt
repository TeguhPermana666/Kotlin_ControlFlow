package com.dicoding.kotlin.controlflow

fun main(){
    loop@
    for(j in 1..10) {
        println("OUTSIDE")
        for (i in 1..10) {
            if (i == 5) {
                break@loop
            }
            println("INSIDE")
        }
    }
    val tampung = listOf(1,2,null,4,null)
    for (i in tampung){
        if(i==null){
            continue
        }
        print(i)
    }
}