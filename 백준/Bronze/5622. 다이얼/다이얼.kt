fun main() {
    val dial = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    val input = readln()
    var result = 0

    repeat(input.length) {
        for (str in dial) {
            if (input[it] in str) {
                result += dial.indexOf(str) + 3
            }
        }
    }

    println(result)
}