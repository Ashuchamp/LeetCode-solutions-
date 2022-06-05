class Solution {
    public boolean isPalindrome(String s) {
        String temp = helper(s);
        temp = temp.toLowerCase();
        String temp1 = "";
        for(int i = temp.length() - 1;i >= 0; i--){
            temp1 += temp.charAt(i);
        }
        return temp1.equals(temp);
        
    }
    
    public String helper(String s){
        String temp = "";
        
        for(int i = 0; i < s.length(); i++){
            int ascii = (int) s.charAt(i);
            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <=122) || (ascii >= 48 && ascii <= 57)){
                temp += s.charAt(i);
            }
        }
        return temp;
        
    }
}