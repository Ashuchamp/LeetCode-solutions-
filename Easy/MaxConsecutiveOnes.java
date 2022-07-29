class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0; 
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                temp = 0;
            }
            else if(nums[i] == 1){
                temp++;
            }
            if(temp > consecutive){
                consecutive = temp;
            }
            
        }
        return consecutive;
    }
}