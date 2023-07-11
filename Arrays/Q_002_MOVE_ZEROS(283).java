class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZeroCount = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if(i != nonZeroCount) {
                    nums[nonZeroCount] = nums[i];
                    nums[i] = 0;
                }
                else;
                nonZeroCount++;
            }
        }
    }
}