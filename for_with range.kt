package controlflow

 fun main(){
     val nilai = 1..10
     for (i in nilai){
         println("Nilai : {$i}")
     }
    println()
     val nilai2 = 1..10 step 2
     for (i in nilai2){
         println("Nilai : {$i}")
     }

     val ranges=1.rangeTo(10)
     for ((index, value ) in ranges.withIndex()){
         println("Nilai $value Index $index")
     }

     val rangas = 1.rangeTo(10) step 2
     rangas.forEachIndexed{
         index,value-> println("Value $value Index $index")
     }

     val rangus = 1.rangeTo((10)) step 3
     rangus.forEach{
         value -> println("$value")
     }
     for ((index) in rangus.withIndex()){
         println("$index")
     }
     rangus.forEachIndexed{
         index,_ ->
         println("$index")
     }
 }