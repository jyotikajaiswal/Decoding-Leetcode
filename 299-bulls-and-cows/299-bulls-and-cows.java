class Solution {
    public String getHint(String secret, String guess) {
        int count =0,c=0;
        int[] arr1 = new int[15];
        int[] arr2 = new int[15];
        for(int i=0;i<secret.length();i++){
            char x = secret.charAt(i);
            char y = guess.charAt(i);
            if(secret.charAt(i) == guess.charAt(i)){
                count++;
                }
            else{
                arr1[x - '0']++;
                arr2[y - '0']++;
            }
            }
        for(int i=0;i<arr1.length;i++){
            c = c+ Math.min(arr1[i],arr2[i]);
        }
        return count + "A" + c + "B";
    }
}