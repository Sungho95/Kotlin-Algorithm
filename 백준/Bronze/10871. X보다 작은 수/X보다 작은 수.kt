fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val input = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    repeat(n) {
        if (input[it] < x) {
            sb.append("${input[it]} ")
        }
    }

    print(sb)
}