class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(!hashMap.containsKey(i+j)){
                        hashMap.put(i+j, new ArrayList<String>());
                    }
                    hashMap.get(i+j).add(list1[i]);
                }
            }
        }
        int min_sum = Integer.MAX_VALUE;
        for(int key: hashMap.keySet()){
            min_sum = Math.min(min_sum, key);
        }
        String[] res = new String[hashMap.get(min_sum).size()];
        return hashMap.get(min_sum).toArray(res);
    }
}