fun main() {
    val n = readln().toInt()
    val arr = Array(100) {
        BooleanArray(100) {
            false
        }
    }
    var result = 0
    
    repeat(n) {
        val input = readln().split(" ").map { it.toInt() }
        val x = input[0]
        val y = input[1]
        
        for (i in x until x + 10) {
            for (j in y until y + 10) {
                if (!arr[i][j]) {
                    arr[i][j] = true
                    result++
                }
            }
        }
    }
    
    println(result)
}