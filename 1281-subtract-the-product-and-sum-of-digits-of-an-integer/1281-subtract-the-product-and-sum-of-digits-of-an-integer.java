class Solution {
    public int subtractProductAndSum(int n) {
    int product = 1;
    int sum = 0;
    int digit= 0;
    int difference =0;
    while(n>0){
        digit = n%10;        
        product *= digit;
        sum += digit;
        n=n/10;

    }
    difference = product - sum;
    return difference;
    }

}