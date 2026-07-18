class Solution {
    public int findGCD(int[] nums) {
    int n = nums.length;
     int min = nums[0];
     for(int i=0;i<n;i++){
        if(min > nums[i]){
            min = nums[i];
        }
     }   
     int max = nums[0];
     for(int i=0;i<n;i++){
        if(max < nums[i]){
            max = nums[i];
        }
     }
     while(min!=0){
        int temp = min;
        min = max % min;
        max = temp;
     }
     return max;
    }
}