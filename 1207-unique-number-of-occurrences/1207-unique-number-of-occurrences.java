class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x = arr[i];
            if(!map.containsKey(x))
                map.put(x,1);
            else
                map.put(x,map.get(x)+1);
        }

        for(int i: map.keySet()){
            for(int j: map.keySet()){
                if (i!=j){
                    if(map.get(i)==map.get(j))
                        return false;
                }
            }
        }    
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //     int x = arr[i], y = arr[j];
        //     if(map.containsKey(x) && map.containsKey(y) && x!=y){
        //         if(map.get(x)==map.get(y))
        //             return false;
        //         else
        //             j++;
        //     }
        // }
        // }
        return true;
    }
}