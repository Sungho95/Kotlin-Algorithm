fun main() {
    val a = readln().toInt()
    val b = readln()
    
    b.reversed().map {
        println((it - '0') * a)
    }
    println(a * b.toInt())
}
