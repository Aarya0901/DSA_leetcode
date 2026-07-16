class Solution {
    public long gcdSum(int[] nums) {
     int n = nums.length ; 
     int[] prefixGCD = new int[n];

     int mx = 0;
     for(int i=0 ; i< n ;i++){
        mx  = Math.max(mx ,nums[i]);
        prefixGCD[i] = gcd(nums[i] , mx);
     }   
     Arrays.sort(prefixGCD);
     long ans = 0;
     for(int i =0; i<n/2 ;i++){
        ans += gcd(prefixGCD[i], prefixGCD[n-i-1]);
     }
     return ans;

    }

    public int gcd(int a , int b){
        while(b != 0){
            int temp = b ;
            b = a %b ;
            a = temp;
        }
        return a;
    }
}