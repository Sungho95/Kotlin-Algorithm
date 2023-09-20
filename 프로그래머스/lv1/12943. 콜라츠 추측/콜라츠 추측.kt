class Solution {
    fun solution(num: Int): Int {
        var input = num

        for (i in 0..499) {
            when {
                input == 1 -> { return i }
                input % 2 == 0 -> { input /= 2 }
                input % 2 == 1 -> { input = input * 3 + 1 }
            }
        }

        return -1
    }
}