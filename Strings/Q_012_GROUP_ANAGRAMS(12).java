class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sw = new String(ch);
            if(!mp.containsKey(sw)) {
                mp.put(sw,new ArrayList<>());
            }
            mp.get(sw).add(word);
        }
        return new ArrayList<>(mp.values());
        
    }
}