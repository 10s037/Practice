/*
 * @lc app=leetcode id=217 lang=scala
 *
 * [217] Contains Duplicate
 */

// @lc code=start
object SolutionLACADSAdAA {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        //this solution uses set theory, a set can have no duiplate element.
        nums.toSet.size != nums.size;
            
    }
}
// @lc code=end

