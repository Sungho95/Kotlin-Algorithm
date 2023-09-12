// class Solution {
//     fun solution(arr: IntArray): Double {
//         return arr.average()
//     }
// }

class Solution {
    fun solution(arr: IntArray): Double {
        val sum = arr.map {
            it.toDouble()
        }
        .sum()
        
        return sum / arr.size
    }
}

// class Solution {
//     fun solution(arr: IntArray): Double {
//         var answer: Double = 0.0

//         for (i in arr) {
//             answer += i
//         }

//         return answer / arr.size
//     }
// }