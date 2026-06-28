/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums. */

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        var s = 0
        for (i in nums.indices){
            s += nums[i]
            res[i] = s
        }
        return res
    }
}
