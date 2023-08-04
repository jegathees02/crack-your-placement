class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        HashMap<Character , String>  map = new HashMap<Character,String>();
        if(digits.length() == 0) return res;
        map = new HashMap();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(digits,0, map,new StringBuilder(),res);
        return res;      
    }
    public static void backtrack(String digits, int i, Map<Character,String> hm,StringBuilder sb, List<String> res) {
        if(i == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String curr = hm.get(digits.charAt(i));
        for(int j=0;j<curr.length();j++) {
            sb.append(curr.charAt(j));
            backtrack(digits,i+1,hm,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}