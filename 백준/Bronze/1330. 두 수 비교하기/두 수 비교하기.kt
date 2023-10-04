fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    
    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}