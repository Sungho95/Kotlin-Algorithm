fun main() {
    val n = readln().toInt()
    val result = StringBuilder()

    (0 until n / 4).forEach { result.append("long ") }
    result.append("int")

    println(result)
}