fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basket = Array(n) { 0 }

    repeat(m) {
        val (i, j, k) = readln().split(" ").map { it.toInt() }

        for (idx in i - 1 until j) {
            basket[idx] = k
        }
    }

    println(basket.joinToString(separator = " "))
}