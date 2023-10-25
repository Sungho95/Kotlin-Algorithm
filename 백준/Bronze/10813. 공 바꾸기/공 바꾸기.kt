fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basket = Array(n) { it + 1 }

    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        val temp = basket[i - 1]
        basket[i - 1] = basket[j - 1]
        basket[j - 1] = temp
    }

    println(basket.joinToString(separator = " "))
}