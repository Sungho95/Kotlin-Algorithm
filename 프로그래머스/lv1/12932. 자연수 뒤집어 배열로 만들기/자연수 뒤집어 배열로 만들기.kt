class Solution {
    fun solution(n: Long): IntArray {
        val answer = n.toString()
            .reversed()
            .map {
                it.toInt() - '0'.toInt()
            }
            .toIntArray()
            
        return answer
    }
}