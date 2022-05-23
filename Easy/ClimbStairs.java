class ClimbStairs {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int a = 1;
        int b = 1;
        for(int i = 1; i <= n; i++){
            b = a + b;
            a = b - a;
        }
        return a;
}
}