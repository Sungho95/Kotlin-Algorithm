fun main() {
    val input = System.`in`.bufferedReader()
    var line: String?

    while (true) {
        line = input.readLine()
        
        if (line == null) {
            break
        }
        
        val numbers = line.split(" ").map { it.toInt() }
        val a = numbers[0]
        val b = numbers[1]

        println(a + b)
    }
}