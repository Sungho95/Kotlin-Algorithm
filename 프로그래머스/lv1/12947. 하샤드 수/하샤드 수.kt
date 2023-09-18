// class Solution {
//     fun solution(x: Int): Boolean {
//         val sum = x.toString()
//             .sumBy {
//                 it.code - '0'.code
//             }.sum()

//         return sum.let { x % it == 0 }
//     }
// }

// class Solution {
//     fun solution(x: Int): Boolean {
//         val sum = x.toString()
//             .sumBy { it.code - '0'.code }

//         return sum.let { x % it == 0 }
//     }
// }

class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        var num = x

        while (num > 0) {
            sum += num % 10
            num /= 10
        }

        return (x % sum == 0)
    }
}