fun main() {
    val n = readln().toInt()
    val input = readln().split(" ").map { it.toInt() }
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    repeat(n) {
        if (input[it] > max) {
            max = input[it]
        }

        if (input[it] < min) {
            min = input[it]
        }
    }

    println("$min $max")
}