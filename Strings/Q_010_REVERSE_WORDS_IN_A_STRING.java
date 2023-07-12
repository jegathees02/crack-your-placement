class Solution {
    public String reverseWords(String s) {
        // ArrayList<String> li = Arrays.asList(s.split(" "));
        String[] li = s.trim().split("\\s+");
        System.out.println(li);
        StringBuilder sb = new StringBuilder();
        for(int i=li.length-1;i>=0;i--) {
            sb.append(li[i]);
            sb.append(" ");
        }
        // sb.remove(sb.de);
        return sb.toString().trim();
    }
}