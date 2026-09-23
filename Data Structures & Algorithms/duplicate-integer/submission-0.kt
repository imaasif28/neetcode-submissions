class Solution {
    val seen = HashSet<Int>()
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.forEach{ num ->
            if (!seen.add(num)) return true
        }
    return false
    }
}
