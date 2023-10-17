fun main() {
    val amount = readln().toInt()
    val n = readln().toInt()
    var sum = 0

    for (i in 1..n) {
        val temp = readln().split(" ")
        val product = temp[0].toInt()
        val count = temp[1].toInt()

        sum += product * count
    }

    if (sum == amount) println("Yes") else println("No")
}