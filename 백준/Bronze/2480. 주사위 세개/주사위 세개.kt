fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    val result = if (a == b && b == c) {
        10000 + a * 1000
    } else if (a == b || b == c) {
        1000 + b * 100
    } else if (a == c) {
        1000 + a * 100
    } else {
        maxOf(a, b, c) * 100
    }

    println(result)
}
