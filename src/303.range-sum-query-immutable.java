/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start


class NumArray {

    int[] arr;

    public NumArray(int[] nums) {
        arr = nums; 
    }
    
    public int sumRange(int left, int right) {
        int sum  = 0;
        for (int i = left; i <= right; i++) {
           // System.out.println(Integer.toString(arr[i]));
            sum = sum + arr[i];       
        }

       return sum;      
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end

