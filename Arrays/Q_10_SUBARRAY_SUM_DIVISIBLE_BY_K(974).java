class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int cnt = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            int diff = (sum%k + k)%k;
            if(hm.containsKey(diff)) {
                cnt += hm.get(diff);
            }
            hm.put(diff,hm.getOrDefault(diff,0)+1);
        }
        return cnt;
        
    }
}