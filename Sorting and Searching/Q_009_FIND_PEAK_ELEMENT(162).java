class Solution {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pos = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=max) {
                pos = i;
                max = nums[i];
            }
        }
        return pos;
    }
}