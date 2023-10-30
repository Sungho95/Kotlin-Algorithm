fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basket = Array(n) { it + 1 }

    repeat(m) {
        val input = readln().split(" ").map { it.toInt() }
        var i = input[0] - 1
        var j = input[1] - 1

        while (i < j) {
            val temp = basket[i]
            basket[i++] = basket[j]
            basket[j--] = temp
        }
    }

    println(basket.joinToString(" "))
}