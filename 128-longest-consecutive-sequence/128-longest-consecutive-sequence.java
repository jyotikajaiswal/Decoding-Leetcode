// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0)
//             return 0;
//         HashMap<Integer,Boolean> map = new HashMap<>();
//         int max=1;
//         for(int i=0;i<nums.length;i++){
//             int x = nums[i];
//             if(!map.containsKey(x)){
//                 if(map.containsKey(x-1))
//                     map.put(x,false);
//                 else
//                     map.put(x,true);
//             }  
//         }
//         for(int key :map.keySet()){
//             if(map.get(key) == true){
//                 int i=1;
//                 while(map.containsKey(key+i)){
//                     i++;
//                 }
//                 if(i>max)
//                     max=i;
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        if(nums.length < 1){
            return 0;
        }
        int maxLongest = 1;
        int longest = 1;
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], false);
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i] + 1) && !map.get(nums[i])){
                longest++;
                map.put(nums[i], !map.get(nums[i]));
            }
            else if(!map.containsKey(nums[i] + 1)){
                maxLongest = Math.max(longest, maxLongest);
                longest = 1;
            }
        }
            
        return maxLongest;
    }
}