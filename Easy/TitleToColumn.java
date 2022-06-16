class Solution {
    public int titleToNumber(String columnTitle) {
        int temp = 0;
        
        for(int i = 0; i < columnTitle.length(); i++){
            temp = temp * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
    
        return temp;
    }
}