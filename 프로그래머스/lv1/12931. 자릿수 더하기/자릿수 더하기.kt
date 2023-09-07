class Solution {
    fun solution(n: Int): Int {
        val answer = n.toString().map {
            it.toInt() - 48
        }.sum()

        return answer
    }
}