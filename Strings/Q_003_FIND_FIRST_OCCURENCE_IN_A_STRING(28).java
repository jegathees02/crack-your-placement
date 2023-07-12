class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;
        int n = needle.length();
        for(int i=0;i<=haystack.length()-n;i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}