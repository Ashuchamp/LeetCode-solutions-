import java.util.Hashtable;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> lists = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(lists.get(nums[i]) == null){
                lists.put(nums[i], 0);
            }
            else{
                return true;
            }
        }
        return false;
    }
}