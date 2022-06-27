class Solution {
    public List<String> fizzBuzz(int n) {
        String[] array = new String[n];
        for(int i=0;i<array.length;i++){
            int x = i+1;
            if(x% 3 ==0 && x%5 == 0)
                array[i] = "FizzBuzz";
            else if (x%3 ==0)
                array[i] = "Fizz";
            else if (x%5 ==0)
                array[i] = "Buzz";
            else
                array[i] = Integer.toString(x);
        }
        List<String> list=new ArrayList<String>();  
        for(String y:array){  
            list.add(y);  
        }  
        return list;
    }
}