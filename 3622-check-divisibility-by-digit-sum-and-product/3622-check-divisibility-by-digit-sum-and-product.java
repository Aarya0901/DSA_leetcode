class Solution {
    public boolean checkDivisibility(int n) {
     int temp = n ;
     int digit = 0 ;
     int sum = 0 ;
     int product = 1 ;
     while(n>0){
        digit = n % 10;
        sum += digit ;
        product *= digit ;
        n = n / 10;
     }   
     if(temp % (sum+product)== 0){
        return true ;
     }
     return false ;
    }
}