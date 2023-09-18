class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString()
            .map {
            it.code - '0'.code 
            }.sum()
        
        val answer = sum.let { 
            x % it == 0
        }
        
        return answer
    }
}