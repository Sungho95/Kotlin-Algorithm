import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var (h, m) = Pair(nextInt(), nextInt())
    val time = nextInt()

    m += time

    if (m >= 60) {
        h += m / 60
        m = m % 60
    }

    if (h >= 24) {
        h = h % 24
    }

    println("$h $m")
}