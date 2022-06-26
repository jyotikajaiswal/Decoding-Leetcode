class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        String n = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", " ");
        String words[] = n.split(" ");
        for(int i=0;i<words.length;i++){
            String x = words[i];
            if(!map.containsKey(x) && x!="")
                map.put(x,1);
            else if(x=="")
                continue;
            else
                map.put(x,map.get(x)+1);
        }
        for(int i=0;i<banned.length;i++){
            String y = banned[i];
            if(map.containsKey(y))
                map.remove(y);
        }
        int max = 0;
        String z="";
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
            if(map.get(words[i])>max){
                max = map.get(words[i]);
                z = words[i];
            }
            }
        }
        return z;
    }
}