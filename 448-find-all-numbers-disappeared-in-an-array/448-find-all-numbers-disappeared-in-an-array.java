class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for(Integer x:nums){  
            set.add(x);  
        }  
        
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i))
                list.add(i);
        }
        return list;
    }
}