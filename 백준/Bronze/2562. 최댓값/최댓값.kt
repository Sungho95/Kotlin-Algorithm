fun main() {
    var max = 0
    var idx = 0

    repeat(9) {
        val input = readln().toInt()

        if (input > max) {
            max = input
            idx = it + 1
        }
    }

    println(max)
    println(idx)
}