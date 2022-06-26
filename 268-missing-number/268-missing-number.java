class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,x=0;
        HashSet<Integer> map = new HashSet();
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
            if(!map.contains(i))
                x = i;
        }
        return x;
    }
}