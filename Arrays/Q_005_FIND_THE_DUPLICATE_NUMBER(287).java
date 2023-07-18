class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] ar = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++) {
            if(ar[nums[i]] == true) return nums[i];
            else ar[nums[i]] = true;
        }
        return -1;
    }
}   