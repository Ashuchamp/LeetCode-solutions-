class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String one = Integer.toString(x);
        String final1 = "";
        for(int i = one.length()-1; i >= 0; i--){
            final1 += one.charAt(i);
        }
        if(final1.equals(one)){
            return true;
        }
        return false;
    }
}