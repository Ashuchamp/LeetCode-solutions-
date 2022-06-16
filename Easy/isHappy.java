class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = helper(n);
        }
        return n == 1;
        
    }
    
    public int helper(int n){
        int total = 0;
        while(n > 0){
            int temp = n%10;
            n = n/10;
            total += temp * temp;
        }
        return total;
    }
}