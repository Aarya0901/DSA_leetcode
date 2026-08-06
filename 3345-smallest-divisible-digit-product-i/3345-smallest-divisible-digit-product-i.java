class Solution {
    public int smallestNumber(int n, int t) {

    int  digits ;
    
     for(int i= n ; i<= Integer.MAX_VALUE ; i++){
            int product = 1;
        int temp = i; 
        while(temp>0){
    digits = temp % 10 ;
    product *= digits ; 
    temp = temp/10 ; 
    }
        if(product % t == 0 )
            return i ;
     }   
     return -1;
    }
}