class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i =0;i<s.length();i++){
            char x = s.charAt(i);
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else
                map.put(x,1);
        }
        for(int i=0;i<t.length();i++){
            char y = t.charAt(i);
            if(map.containsKey(y)){
                if(map.get(y)==1)
                    map.remove(y);
                else
                    map.put(y,map.get(y)-1);
            }
            else
                return false;
        }
        if(map.size() > 0)
            return false;
        return true;
    }
}
