fun main() {
    val result = readln().split(" ")
        .map { it.toLong() }
        .sum()

    println(result)
}