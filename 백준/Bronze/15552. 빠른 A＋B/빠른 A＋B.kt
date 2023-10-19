import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()
    var st: StringTokenizer
    
    (1..n).forEach { 
        st = StringTokenizer(readln())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        sb.append(a + b).append("\n")
    }

    println(sb)
}