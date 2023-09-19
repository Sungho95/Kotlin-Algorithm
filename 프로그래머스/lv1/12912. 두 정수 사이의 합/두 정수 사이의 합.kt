// import kotlin.math.max
// import kotlin.math.min

// class Solution {
//     fun solution(a: Int, b: Int): Long {
//         return (min(a, b)..max(a, b))
//             .map { it.toLong() }
//             .sum()
//     }
// }

// class Solution {
//     fun solution(a: Int, b: Int): Long {
//         return when {
//             a == b -> a.toLong()
//             a < b -> (a..b).map { it.toLong() }.sum()
//             else -> (b..a).map { it.toLong() }.sum()
//         }
//     }
// }

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer = 0L
        
        if (a == b) {
            return a.toLong()
        }
        
        val min = min(a, b)
        val max = max(a, b)
        
        for (i in min..max) {
            answer += i
        }
        
        return answer
    }
}