class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = new String();
        while(columnNumber > 0){
            columnNumber--;
            ans += ((char) ('A' + columnNumber%26));
            columnNumber = columnNumber/26;
            
            System.out.println(ans);
        }
        String temp = "";
        for(int i = ans.length() - 1; i >= 0; i--){
            temp += ans.charAt(i);
        }
        return temp;
    }
}