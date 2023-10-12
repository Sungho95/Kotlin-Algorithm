fun main() {
    val t = readln().toInt()
    
    for (i in 0 until t) {
        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        println(a + b)
    }
}