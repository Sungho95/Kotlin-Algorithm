import kotlin.text.StringBuilder

fun main() {
    val t = readln().toInt()
    val p = StringBuilder()

    repeat(t) {
        val input = readln().split(" ")
        val r = input[0].toInt()
        val s = input[1]
        
        repeat(s.length) {
            p.append(s[it].toString().repeat(r))
        }

        println(p)
        p.clear()
    }
}