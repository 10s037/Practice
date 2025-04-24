/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashSet;


class Solutionb {
    public int singleNumber(int[] nums) {

        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
            /* XOR operator properties */
            // binaryNum ^ 0 = binaryNum
            // binaryNum ^ binaryNum = 0
            
        }

        return  ans;
    }
}
// @lc code=end

