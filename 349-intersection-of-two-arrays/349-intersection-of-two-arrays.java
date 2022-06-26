class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            int x = nums1[i];
            map.put(x,1);
        }
        int count=0;
        for(int i=0;i<nums2.length;i++){
            int y = nums2[i];
            if(map.containsKey(y)){
                arr.add(y);
                count++;
                map.remove(y);
            }
        }
        int[] array = new int[count];
        for(int i=0;i<array.length;i++){
            array[i] = arr.get(i);
        }
        return array;
    }
}