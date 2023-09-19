import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(a: Int, b: Int): Long {
        return if (a == b) {
            a.toLong()
        } else {
            (min(a, b)..max(a, b))
                .map {
                    it.toLong()
                }
                .sum()
        }
    }
}