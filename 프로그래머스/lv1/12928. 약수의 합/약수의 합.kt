class Solution {
    fun solution(n: Int): Int {
        val answer = (1..n).filter {
            n % it == 0
        }.sum()
        
        return answer
    }
}