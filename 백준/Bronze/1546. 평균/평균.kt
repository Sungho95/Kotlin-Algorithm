fun main() {
    val n = readln().toInt()
    val score = readln().split(" ").map { it.toDouble() }.toDoubleArray()
    val m = score.max()

    repeat(n) {
        score[it] = score[it] / m * 100
    }

    println(score.average())
}