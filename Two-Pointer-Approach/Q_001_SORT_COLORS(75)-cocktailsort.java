//cocktail sorting is used
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length;
        boolean swap = true;
        while(swap) {
            swap = false;
            for(int i=left;i<right-1;i++) {
                if(nums[i] > nums[i+1]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swap = true;
                }
            }
            if(swap == false) break;
            right--;
            for(int i=right-1;i>=left;i--) {
                if(nums[i] > nums[i+1]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swap = true;
                }
            }
            left++;
        }
    }
}