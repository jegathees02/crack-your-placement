class Solution {
    public int maxPoints(int[][] points) {
        if(points.length == 1) return 1;
        int count = 2; //min two points should be in straight line
        int n = points.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int ext = 2;
                for(int k=1;k<n;k++) {
                    if(k==i || k == j) continue;
                    int a = points[i][0]*(points[j][1]-points[k][1]);
                    int b = points[j][0]*(points[k][1]-points[i][1]);
                    int c = points[k][0]*(points[i][1]-points[j][1]);
                    if(a+b+c==0) ext++;
                }
                count = Math.max(count,ext);
            }
        }
        return count;
    }
}