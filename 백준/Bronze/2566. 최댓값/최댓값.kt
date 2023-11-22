fun main() {
    var max = 0
    var row = 0
    var col = 0

    for (i in 0 until 9) {
        val input = readln().split(" ").map { it.toInt() }

        for (j in 0 until 9) {
            if (input[j] >= max) {
                max = input[j]
                row = i + 1
                col = j + 1
            }
        }
    }

    println("$max\n$row $col")
}