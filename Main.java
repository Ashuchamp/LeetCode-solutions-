import java.util.*;
import java.util.Enumeration;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] temp = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(temp));
  }

  public static int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!ht.contains(nums[i])){
                ht.put(nums[i], 1);
            }
            else{
              System.out.println("gone");
              int tem = ht.get(nums[i])+1;
                ht.put(nums[i], ht.get(tem));
            }
        }
        int num = 0;
        int max = 0;
        
        Enumeration<Integer> iter = ht.keys();
        
        while(iter.hasMoreElements()){
            int check = iter.nextElement();
            if(ht.get(check) > max){
                max = ht.get(check);
                num = check;
            }
        }
        return num;
    }
}