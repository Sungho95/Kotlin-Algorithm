fun main() {
    val input = readln().toInt()

    if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
        println(1)
    } else {
        println(0)
    }
}