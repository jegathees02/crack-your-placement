class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left = 0 , right = n-1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right)) {
                return Solution.isValid(s,left+1,right) || Solution.isValid(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean isValid(String s , int left , int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}