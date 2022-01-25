package controlflow

fun main(){
    //Definisikan object enum class
    val color : Color = Color.BLUE
    println(color)

    val warna : Warna = Warna.BAGUS
    println(warna)

    val wujud : Wujud = Wujud.Lembek
    println(wujud)

    val muka : Coolor = Coolor.RED
    println(muka)

    //Values ->digunakan untuk mengambil daftar list dari atribut enum class
    val a : Array<bentuk> = bentuk.values()
    a.forEach { aksi -> println(aksi) }

    // Value of -> digunakan utnuk mengambil nilai dari daftar list atrubut enum class

    val b : bentuk = bentuk.valueOf("RED")
    println(b)

    val c : bentuk = bentuk.BLUE
    when(c){
        bentuk.BLUE -> println("COLOR IS $c")
        bentuk.RED -> println("COLOR IS $c")
        bentuk.GREEN -> println("COLOR IS $c")
    }
}
enum class Color (vale : Int){
    RED (0xFF0000),
    BLUE(0x00FF00),
    GREEN(0x0000FF);
}
enum class Warna {
    BAGUS,BIASA,JELEK
}

enum class  Wujud(nilai : Int){
    Solid(1),
    Keras(2),
    Lembek(3);

}

//annoymous class
enum class Coolor(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };abstract fun printValue()
}

enum class bentuk (valee :Int) {
    RED (1),
    BLUE(2),
    GREEN(3);
}