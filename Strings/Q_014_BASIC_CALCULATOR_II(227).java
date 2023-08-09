class Solution {
    public int calculate(String s) {
        if(s == null || s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int curr_num = 0;
        char oper = '+';
        for(int i=0;i<len;i++) {
            char curr_char = s.charAt(i);
            if(Character.isDigit(curr_char)) {
                curr_num = curr_num*10 + (curr_char - '0');

            }
            if(!Character.isDigit(curr_char) && !Character.isWhitespace(curr_char) || i == len - 1) {
                if(oper == '+') {
                    stack.push(curr_num);
                }
                else if(oper == '-') {
                    stack.push(-curr_num);
                }
                else if(oper == '*') {
                    stack.push(stack.pop() * curr_num);
                }
                else if(oper == '/') {
                    stack.push(stack.pop() / curr_num);
                }
                oper = curr_char;
                curr_num = 0;
            }
        }
        int res = 0;
        while(!stack.isEmpty()) res += stack.pop();
        return res;
    }
}