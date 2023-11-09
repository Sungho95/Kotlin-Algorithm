fun main() {
    val n = readln().toInt()
    val input = readln()
    var sum = 0
    
    repeat(n) {
        sum += input[it] - '0'
    }

    println(sum)
}