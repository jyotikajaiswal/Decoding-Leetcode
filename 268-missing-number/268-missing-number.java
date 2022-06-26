class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,x=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],1);
        }
        for(int i=0;i<=n;i++){
            if(!map.containsKey(i))
                x = i;
        }
        return x;
    }
}