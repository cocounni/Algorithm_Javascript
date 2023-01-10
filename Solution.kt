class Solution {
    fun solution(babbling: Array<String>): Int {
        val regex = "aya|ye|woo|ma".toRegex()
        val answer: Int = babbling.map { it.replace(regex, "") }
            .filter { it.length == 0 }
            .count()
        return answer
    }
}