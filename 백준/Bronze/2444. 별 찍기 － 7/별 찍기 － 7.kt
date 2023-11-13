fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    for (i in 1 .. n) {
        for (j in 0 until n - i) {
            sb.append(" ")
        }

        for (j in 0 until i * 2 - 1) {
            sb.append("*")
        }

        sb.append("\n")
    }

    for (i in n - 1 downTo 0) {
        for (j in 0 until n - i) {
            sb.append(" ")
        }

        for (j in 0 until i * 2 - 1) {
            sb.append("*")
        }

        sb.append("\n")
    }

    println(sb)
}