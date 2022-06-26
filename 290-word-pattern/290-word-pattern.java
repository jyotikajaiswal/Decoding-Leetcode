class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String words[]=s.split(" ");
        if (pattern.length()!=words.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String x = words[i];
            if(!map.containsKey(p)){
                if(map.containsValue(x))
                    return false;
                map.put(p,x);
            }
            else if(map.containsKey(p) && !x.equals(map.get(p)))
                return false;
        }
        return true;
    }
}