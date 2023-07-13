class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r_start = 0;
        int r_end = matrix.length-1;
        int c_start = 0;
        int c_end = matrix[0].length-1;
        List<Integer> li = new ArrayList<Integer>();
        while(r_start <= r_end && c_start <= c_end) {
            //left
            for(int i=c_start;i<=c_end;i++) {
                li.add(matrix[r_start][i]);
            }
            r_start++;
            //down
            for(int i=r_start;i<=r_end;i++) {
                li.add(matrix[i][c_end]);
            }
            c_end--;

            if(r_start <= r_end) {
                for(int i=c_end;i>=c_start;i--) {
                    li.add(matrix[r_end][i]);
                }
            }
            r_end--;
            if(c_start <= c_end) {
                for(int i=r_end;i>=r_start;i--) {
                    li.add(matrix[i][c_start]);
                }
            }
            c_start++;
        }
        return li;
        
    }
}