class Solution {
    public String convertToTitle(int columnNumber) {
        // String ans = "";
        // while (columnNumber>0){
        //     columnNumber--;
        //     ans = (char) ('A'+ (columnNumber%26)) + ans;
        //     columnNumber = columnNumber/26;
        // }
        // return ans;


    //   StringBuilder sb=new StringBuilder();
    //   while(columnNumber>0){
    //     sb.append((char)((--columnNumber)%26+65));

    //     columnNumber/=26;
    //   }
     
    //   return sb.reverse().toString();

        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            char a = (char)(columnNumber%26 + 'A');
            columnNumber /= 26;
            sb.append(a);
        }
        return sb.reverse().toString();
 
    }
}