class Solution {
    public String addBinary(String a, String b) {
        StringBuilder bin=new StringBuilder();
        int sum ,carry=0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0||j>=0){
            sum = carry;
            if(i>=0){
              sum = sum+a.charAt(i)-'0';
              i--;
            }
            if(j>=0){
              sum = sum+b.charAt(j)-'0';
              j--;
            }
                if(sum==0){
                    carry =0;
                    }
                else if(sum==1){
                    carry =0;
                    }
                else if(sum==2){
                    carry =1;
                    } 
                else if(sum==3){
                    carry =1;
                 } 
            
            bin.append(sum%2);
    }
        if(carry==1){
            bin.append('1');
            
        }
        bin.reverse();
        return bin.toString();
    }
}