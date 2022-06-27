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

	int max = 0;

	public int longestConsecutive(int[] nums) {
		HashMap<Integer,Boolean> hashMap = new HashMap<>();
		for (int i:nums) hashMap.put(i,true);
		for (int i: nums) {

			int count = 1, j= i;
			while (hashMap.containsKey(--j)){
				hashMap.remove(j);
				count++;
			}
			j = i;
			while (hashMap.containsKey(++j)){
				hashMap.remove(j);
				count++;
			}
			max = Math.max(max,count);
		}
		return max;
	}
}