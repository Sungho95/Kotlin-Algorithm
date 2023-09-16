import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val squareRoot = sqrt(n.toDouble())

        return if (squareRoot == floor(squareRoot)) {
            (squareRoot + 1).pow(2).toLong()
        } else {
            -1L
        }
    }
}