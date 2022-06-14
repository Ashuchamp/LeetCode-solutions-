class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> temp = new ArrayList();
        ArrayList<Integer> ans = new ArrayList();
        
        for(int i = 0; i < nums1.length; i++){
            if(!temp.contains(nums1[i])){
            temp.add(nums1[i]);
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(temp.contains(nums2[i])){
                temp.remove(Integer.valueOf(nums2[i]));
                ans.add(nums2[i]);
            }
        }
        
        int[] fin = new int[ans.size()];
        for(int i = 0; i < fin.length; i++){
            fin[i] = ans.get(i);
        }
        return fin;
        
        
       
        
    }
}