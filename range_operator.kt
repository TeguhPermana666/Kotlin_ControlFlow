package com.dicoding.kotlin.controlflow

fun main(){
    val nilai =1..10 step 2
    //step adalah jarak dala range bisa nilai ataupun karakter

    //it adalah default variabel dalam for each dimana it disini mengandung sebuah nilai dari range
    nilai.forEach{
        print("$it")
    }
    println()
    println("Nilai step adalah ${nilai.step}")

    val a = 1.rangeTo(10)
    if(7 in a){
        println("{$a} is availebel")
    }
    val b = 10.downTo(1)
        if (11 in b){
            println("{${b}} is avail")
        }
        else{
            println("{${b}}NOT AVAIL")
        }
}