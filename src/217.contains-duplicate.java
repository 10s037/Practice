/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.Arrays;

class Solutiona {
    public boolean containsDuplicate(int[] nums) {


      Arrays.sort(nums);
            for (int j =  0; j < nums.length-1; j++) {
                if(nums[j] == nums[j+1]){
                    return true;
                }
            }
       

    return false;
        
    }
}
// @lc code=end

