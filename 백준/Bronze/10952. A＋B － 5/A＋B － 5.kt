fun main() {
    while (true) {
        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        
        if (a == 0 && b == 0) {
            break
        }

        println(a + b)
    }
}