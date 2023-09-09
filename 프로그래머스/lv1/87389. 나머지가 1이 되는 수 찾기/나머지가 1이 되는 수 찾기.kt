class Solution {
    fun solution(n: Int): Int {
        val answer = (1..n).first {
            i -> n % i == 1
        }
        
        return answer
    }
}