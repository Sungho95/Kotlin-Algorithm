fun main() {
    val input = readln().split(" ")
    var h = input[0].toInt()
    var m = input[1].toInt()
    
    m -= 45
    if (m < 0) {
        m += 60
        h -= 1
    }
    
    if (h < 0) {
        h = 23
    }

    println("$h $m")
}