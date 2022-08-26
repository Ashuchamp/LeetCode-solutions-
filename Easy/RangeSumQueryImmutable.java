//Slower solution

class NumArray {
    
    int[] NumsArray;
    public NumArray(int[] nums) {
        NumsArray = new int[nums.length];
        NumsArray = nums;
        // for(int i = 0; i < nums.length; i++){
        //     NumsArray = nums;
        // }
    }
    
    public int sumRange(int left, int right) {
        // int[] nums = NumsArray;
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += NumsArray[i];   
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */


//-----------------------------//
//Faster solution

class NumArray {
    
    int[] NumsArray;
    public NumArray(int[] nums) {
        NumsArray = new int[nums.length];
        NumsArray = nums;
        for(int i = 0; i < nums.length; i++){
            NumsArray = nums;
        }
    }
    
    public int sumRange(int left, int right) {
        int[] nums = NumsArray;
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += nums[i];   
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

//----------------------------------//
//Fastest Solutuion

class NumArray {
  public NumArray(int[] nums) {
    sum = new int[nums.length + 1];
    for (int i = 0; i < nums.length; ++i)
      sum[i + 1] = nums[i] + sum[i];
  }

  public int sumRange(int left, int right) {
    return sum[right + 1] - sum[left];
  }

  private int[] sum;
}