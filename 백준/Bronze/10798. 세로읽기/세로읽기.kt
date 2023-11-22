fun main() {
    val arr = Array(5) {
        CharArray(15) {
            '@'
        }
    }
    var length = 0
    val sb = StringBuilder()

    for (i in 0 until arr.size) {
        val input = readln()

        if (input.length > length) {
            length = input.length
        }

        for (j in 0 until input.length) {
            arr[i][j] = input[j]
        }
    }

    for (i in 0 until length) {
        for (j in 0 until arr.size) {
            if (arr[j][i] == '@') {
                continue
            }
            sb.append(arr[j][i])
        }
    }

    println(sb)
}