fun main() {
    val input = readln().split(" ")
    val n = input[0]
    val b = input[1].toInt()

    val result = decimalConverter(n, b)

    println(result)
}

fun decimalConverter(n: String, b: Int): Int {
    val num = n.reversed()
    var digit = 1
    var decimal = 0

    for (i in 0 until num.length) {
        if (num[i] >= 'A') {
            decimal += (num[i] - 'A' + 10) * digit
        } else {
            decimal += (num[i] - '0') * digit
        }
        digit *= b
    }

    return decimal
}