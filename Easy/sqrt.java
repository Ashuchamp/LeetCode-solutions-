class sqrt {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int sqrt = x/2;
        int temp = x/2+1;
        
        while(temp > sqrt){
            temp = sqrt;
            sqrt = ((x/temp) + temp)/2;
        }
        return temp;
    }
    
   
}