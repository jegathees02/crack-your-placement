class Solution {
    public int minMoves(int[] nums) {
        int l = nums.length;
        int small = nums[0];
        int sum = 0;
        for(int i=0;i<l;i++) {
            if(nums[i] < small) {
                small = nums[i];
            }
            sum += nums[i];
        }
        return sum-(small*l);
    }
}