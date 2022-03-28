class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int dups = 0;
        List<Integer> single = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!single.contains(nums[i])){
                dups++;  
                single.add(nums[i]);
            }
        }
        for(int i = 0; i < single.size(); i++){
            nums[i] = single.get(i);
        }
        return dups;
        
    }
}