/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class SolutionALDAS {
    public int[] twoSum(int[] nums, int target) {

        Set<Integer> targetArray = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums [j] == target ){
                    targetArray.add(i);
                    targetArray.add(j);
                }
            }
        }

        return targetArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

