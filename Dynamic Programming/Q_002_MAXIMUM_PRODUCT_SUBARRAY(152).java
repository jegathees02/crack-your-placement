class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length < 1) return 0;
        if(nums.length == 1) return nums[0];
        int tot_max = nums[0];
        for(int i=0;i<nums.length;i++) {
            int p = nums[i];
            for(int j=i+1;j<nums.length;j++) {
                tot_max = Math.max(tot_max,p);
                p *= nums[j];
            }
            tot_max = Math.max(tot_max,p);
        }
        return tot_max;
    }
}