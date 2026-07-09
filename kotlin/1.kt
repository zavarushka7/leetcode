/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashmap = HashMap<Int, Int>()
        for (i in nums.indices){
            val diss = target - nums[i]
            if (hashmap.containsKey(diss)){
                return intArrayOf(hashmap[diss]!!, i)
            } else {
                hashmap[nums[i]] = i
            }
        }
        return intArrayOf()
    }
}
