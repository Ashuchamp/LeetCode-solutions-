class Solution {
    public int[] plusOne(int[] digits) {
        int pre = 0;
        for(int i = 0; i < digits.length; i++){
            pre += digits[i] * Math.pow(10, i);
        }
        ArrayList temp = new ArrayList();
        while(pre / 10 >= 1){
            temp.add(pre%10);
            pre = pre/10;
            
        }
        temp.add(pre);
        System.out.println(temp);
        temp.set(temp.size()-1, temp.get(temp.size()-1)+1);
        
        int[] finals = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i--){
            finals[finals.length-i-1] = (int)temp.get(i);
        }
        return finals;
    }
}