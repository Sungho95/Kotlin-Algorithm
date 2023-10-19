fun main() {
    val n = readln().toInt()

    for (row in 1..n) {
        println(" ".repeat(n - row) + "*".repeat(row))
    }
}