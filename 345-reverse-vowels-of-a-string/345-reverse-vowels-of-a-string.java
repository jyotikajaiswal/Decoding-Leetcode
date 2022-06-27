class Solution {
    public String reverseVowels(String s) {
        List<Character> arr = new ArrayList<Character>();
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');
        arr.add('A');
        arr.add('E');
        arr.add('I');
        arr.add('O');
        arr.add('U');
        char[] array = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(!arr.contains(array[i])){
                i++;
                continue;
            }
            else if(!arr.contains(array[j])){
                j--;
                continue;
            }
            char temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            i++;
            j--;
        }
        return new String(array);
    }
}