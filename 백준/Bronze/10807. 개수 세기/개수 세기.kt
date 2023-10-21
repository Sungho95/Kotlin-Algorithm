fun main() {
    val n = readln().toInt()
    val input = readln().split(" ").map { it.toInt() }
    val v = readln().toInt()
    val result = input.count { it == v }

    println(result)
}