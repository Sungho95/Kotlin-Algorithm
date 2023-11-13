fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val chess = arrayOf(1, 1, 2, 2, 2, 8)
    val result = Array(6) { 0 }

    repeat(input.size) {
        result[it] = chess[it] - input[it]
    }

    println(result.joinToString(" "))
}