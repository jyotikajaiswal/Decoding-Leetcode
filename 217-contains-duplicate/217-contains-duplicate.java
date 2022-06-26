class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(!map.containsKey(x))
                map.put(x,1);
            else
                map.put(x,2);
        }
        if(map.containsValue(2))
            return true;
        else
            return false;
    }
}