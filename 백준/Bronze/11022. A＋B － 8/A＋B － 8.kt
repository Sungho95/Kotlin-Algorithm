fun main() {
    val n = readln().toInt()

    repeat(n) {
        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        println("Case #${it + 1}: $a + $b = ${a + b}")
    }
}
