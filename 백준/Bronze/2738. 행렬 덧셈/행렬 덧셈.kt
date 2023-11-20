fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = Array(n) {
        IntArray(m) {
            0
        }
    }

    for (i in 0 until n) {
        val input = readln().split(" ").map { it.toInt() }
        
        for (j in 0 until m) {
            a[i][j] = input[j]
        }
    }
    
    for (i in 0 until n) {
        val input = readln().split(" ").map { it.toInt() }
        
        for (j in 0 until m) {
            a[i][j] += input[j]
        }
    }

    a.forEach { row ->
        row.forEach {
            print("$it ")
        }
        println()
    }
}