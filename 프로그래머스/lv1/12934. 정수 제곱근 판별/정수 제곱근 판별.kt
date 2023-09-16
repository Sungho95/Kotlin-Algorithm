import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble())

        return if (sqrt == floor(sqrt)) {
            (sqrt + 1).pow(2).toLong()
        } else {
            -1L
        }
    }
}

// import kotlin.math.sqrt

// class Solution {
//     fun solution(n: Long): Long {
//         val sqrt = sqrt(n.toDouble()).toLong()
        
//         return if (sqrt * sqrt == n) {
//             (sqrt + 1) * (sqrt + 1) 
//         } else {
//             -1L
//         }
//     }
// }