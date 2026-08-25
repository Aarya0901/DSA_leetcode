class Solution {
    public int missingMultiple(int[] nums, int k) {
     Arrays.sort(nums) ;
     int i = 0 ;
     int j = 0;
     int[] arr=  new int[nums.length] ;
     while(i < nums.length){
        if(nums[i] % k == 0){
            arr[j] = nums[i] ;
            j++ ;
        }
        i++ ;
     }   
     int check = 1 ;
     for(int l = 0 ; l <j; l++){
        int multiple = arr[l] / k;
        if(multiple == check){
            check++ ;
        }
        else if(multiple > check){
            return check*k ;
        }
     }
     return check* k ;
    }
}