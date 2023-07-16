class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<Integer>();
        while(n != 1 && !st.contains(n)) {
            st.add(n);
            int sum = 0;
            while(n!=0) {
                int dig = n % 10;
                sum += dig * dig;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}