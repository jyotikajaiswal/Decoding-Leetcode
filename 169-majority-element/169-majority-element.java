class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int c = map.get(nums[i]);
                c++;
                map.put(nums[i],c);
            }
            else
                map.put(nums[i],1);
        }
        int k=0;
        for(Integer key : map.keySet()){
            if(map.get(key)>nums.length/2)
                k = key;
        }
        return k;
    }
}