class Solution {
    public String simplifyPath(String path) {
        String[] ar = path.split("/");
        Stack<String> st = new Stack<String>();
        for(String str : ar) {
            if(str.equals("..")){
                if(!st.isEmpty()) {
                st.pop();
                }
            }
            else if(str.length() != 0 && !str.equals(".")) {
                st.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.insert(0,"/"+st.pop());
        }
        return sb.toString().length() > 0 ? sb.toString() : "/";
        
    }
}