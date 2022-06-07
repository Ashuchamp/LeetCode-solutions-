class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }
        
        int[] last = new int[m+n];
        int a = 0;
        int b = 0;
        for(int i = 0; i < m+n; i++){
            if(a == m){
                last[i] = nums2[b];
                b++;
            }
            else if(b == n){
                last[i] = nums1[a];
                a++;
            }
            else{
                if(nums1[a] > nums2[b]){
                    last[i] = nums2[b];
                    b++;
                }
                else if(nums1[a] <= nums2[b]){
                    last[i] = nums1[a];
                    a++;
                }
            }
        }
        
        for(int i = 0; i < m+n; i++){
            nums1[i] = last[i];
        }
      }
}