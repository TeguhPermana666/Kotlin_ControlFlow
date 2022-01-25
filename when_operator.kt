package controlflow
//when ini mirip lah dengan switch case
fun main(){
    val value : Number= 8
    when(value){
        7 -> println("NILAI ADALAH 7")
        8 -> println("NILAI ADALAH 8")
        9 -> println("NILAI ADALAH 9")

        else -> println("VALUE TIDAK DITEMUKAN")
    }

    val tampung = when (value){
        7 -> {
            println("SEVEN")
            "NILAI ADALAH 7"
            }
        8-> {
            println("EITGHT")
            "NILAI ADALAH 8"
        }
        9-> {
            println("NINE")
            "NILAI ADALAH 9"
        }
        else ->  "TIDAK DITEMUKAN"//when return wajib berisikan when dalam brucket
    }
    println(tampung)

    //mengetahui instance dari sebuah object menggunakan is
    val anytype = 10L
    when (anytype){
        is Number -> println("THIS IS integer bray")
        is Long -> println ("THIS IS LONG BRAY")
        else -> println("WRoNG")
    }
    val valuee =10
    val ranges = 1..8
    val beban= when (valuee){
        in ranges -> ("DALAM JANGKUAN")
        !in ranges -> ("TIDAK DALAM JANGKUAN")
        else->("WRONG")
    }
    println(beban)
}