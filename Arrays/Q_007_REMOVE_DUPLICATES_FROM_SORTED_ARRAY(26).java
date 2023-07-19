class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new LinkedHashSet<Integer>();
        st.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
                st.add(nums[i]);
        }
        int j = 0;
        int n=0;
        for(Integer a : st)
        {
            nums[j] = a;
            j++;
            n++;
        }
        return n;
    }
}