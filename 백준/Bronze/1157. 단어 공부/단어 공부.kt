import java.util.Locale

fun main() {
    val input = readln().uppercase(Locale.getDefault())
    val arr = IntArray(26) { 0 }

    repeat(input.length) {
        val idx = input[it] - 'A'
        arr[idx]++
    }

    var max = -1
    var result = '?'

    repeat(arr.size) {
        if (max < arr[it]) {
            max = arr[it]
            result = (it + 65).toChar()
        } else if (max == arr[it]) {
            result = '?'
        }
    }

    println(result)
}