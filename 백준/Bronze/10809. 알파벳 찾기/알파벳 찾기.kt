fun main() {
    val s = readln()
    val alphabet = Array(26) { -1 }

    repeat(s.length) {
        val idx = s[it] - 'a'

        if (alphabet[idx] == -1) {
            alphabet[idx] = it
        }
    }

    println(alphabet.joinToString(" "))
}