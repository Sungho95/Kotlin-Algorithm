import kotlin.math.max

fun main() {
    val input = readln().split(" ")
    val a = input[0].reversed().toInt()
    val b = input[1].reversed().toInt()

    println(max(a, b))
}