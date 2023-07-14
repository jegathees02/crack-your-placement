class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
            Integer a = (Integer)nums[i];
            if(hm.containsKey(a)) li.add(nums[i]);
            else hm.put(a,1);
        }
        return li;
        
    }
}