class Solution {
    fun solution(n: Int): Int {
        val answer = (1..n).first {
            n % it == 1
        }
        
        return answer
    }
}