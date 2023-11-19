fun main() {
    val n = readln().toInt()
    var result = 0

    for (i in 0 until n) {
        val input = readln()

        if (groupWordChecker(input)) {
            result++
        }
    }

    println(result)
}

fun groupWordChecker(word: String): Boolean {
    val alphabet = BooleanArray(26) { false }

    for (i in 0 until word.length) {
        val current = word[i] - 'a'

        if (alphabet[current]) {
            if (word[i] != word[i - 1]) {
                return false
            } else {
                continue
            }
        } else {
            alphabet[current] = true
        }
    }

    return true
}