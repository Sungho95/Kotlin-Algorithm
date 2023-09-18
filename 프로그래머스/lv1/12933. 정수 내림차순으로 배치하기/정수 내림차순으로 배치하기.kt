class Solution {
    fun solution(n: Long): Long {
        var answer = n
            .toString()
            .toList()
            .sortedDescending()
            .joinToString()
            .replace(", ", "")
            .toLong()
        return answer
    }
}