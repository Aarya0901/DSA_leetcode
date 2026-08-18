class Solution {
    public int missingNumber(int[] nums) {
     int max = Integer.MIN_VALUE ;
     for(int i =0 ; i<= nums.length -1 ; i++){
        if(nums[i] > max){
            max = nums[i] ; 
        }
     }
     int total_sum = (nums.length*(nums.length+1))/2 ;
     int current_sum = 0 ;
     for(int i=0; i<= nums.length-1 ; i++ ){
        current_sum += nums[i] ;
     }
     return total_sum - current_sum ;   
    }
}