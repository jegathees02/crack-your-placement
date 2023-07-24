class Solution {
    public static boolean[][] visited;
    public static boolean search(int i, int j,int index, char[][] board,String word) {
        if(index == word.length()) return true;
        if(i<0 || i>=board.length || j < 0 || j >= board[i].length || index >= word.length() || visited[i][j] || board[i][j] != word.charAt(index)) return false;
        visited[i][j] = true;
        if(search(i+1,j,index+1,board,word) ||
        search(i-1,j,index+1,board,word) ||
        search(i,j+1,index+1,board,word) ||
        search(i,j-1,index+1,board,word) 
        ) return true;
        visited[i][j] = false;
        
        return false;
    }
    public boolean exist(char[][] board, String word) {
       visited = new boolean[board.length][board[0].length];
        // Arrays.fill(visited,false);
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                // visited[i][j] = true;
                if(word.charAt(0) == board[i][j] &&  Solution.search(i,j,0,board,word)) return true;
            }
        }
        return false;
    }
}