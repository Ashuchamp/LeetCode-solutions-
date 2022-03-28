class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i =0 ; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = 100;
                k--;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 100){
                for(int j = i; j < nums.length; j++){
                    if(nums[j]!= 100){
int c = nums[i];
                        nums[i] = nums[j];
                      nums[j] = c;                    }
                }
            }
            
        }
        return k;
    }
}