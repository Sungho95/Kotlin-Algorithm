fun main() {
    val n = readln().toInt()
    val result = StringBuilder()

    (0 until n / 4).forEach { _ -> result.append("long ") }
    result.append("int")

    println(result)
}