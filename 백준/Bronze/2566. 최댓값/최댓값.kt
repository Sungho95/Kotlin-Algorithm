fun main() {
    var max = 0
    var x = 0
    var y = 0

    for (i in 0 until 9) {
        val input = readln().split(" ").map { it.toInt() }

        for (j in 0 until 9) {
            if (input[j] >= max) {
                max = input[j]
                x = i + 1
                y = j + 1
            }
        }
    }

    println("$max\n$x $y")
}