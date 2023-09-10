// class Solution {
//     fun solution(x: Int, n: Int): LongArray {
//         var answer = LongArray(n)
//         answer[0] = x.toLong()
        
//         for (i in 1 until n) {
//             answer[i] = answer[i - 1] + x
//         }
        
//         return answer
//     }
// }

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        return LongArray(n) { x.toLong() * (it + 1) }
    }
}