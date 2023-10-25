fun main() {
    val arr = Array(30) { false }

    repeat(28) {
        val n = readln().toInt()
        arr[n - 1] = true
    }

    repeat(arr.size) {
        if (!arr[it]) {
            println(it + 1)
        }
    }
}