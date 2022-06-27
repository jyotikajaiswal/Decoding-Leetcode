class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for(Integer x:nums){  
            set.add(x);  
        }  
        int i=1;
        while(i<=nums.length){
            if(!set.contains(i))
                list.add(i);
            i++;
        }
        return list;
    }
}