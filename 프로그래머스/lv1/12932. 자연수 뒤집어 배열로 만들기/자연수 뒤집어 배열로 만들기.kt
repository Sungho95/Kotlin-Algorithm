// class Solution {
//     fun solution(n: Long): IntArray {
//         val answer = n.toString()
//             .reversed()
//             .map {
//                 it.toInt() - '0'.toInt()
//             }
//             .toIntArray()
            
//         return answer
//     }
// }


// class Solution {
//     fun solution(n: Long): IntArray {
//         var answer = arrayListOf<Int>()
//         var number = n
        
//         while (number > 0) {
//             answer.add((number % 10).toInt())
//             number /= 10
//         }
        
//         return answer.toIntArray()
//     }
// }

class Solution {
    fun solution(n: Long): IntArray {
        val s = n.toString()
        var answer = IntArray(s.length)
        
        for (i in 0 until s.length) {
            answer[i] = s[s.length - i - 1].toInt() - '0'.toInt()
        }
        
        return answer
    }
}