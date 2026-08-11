class Solution {
    public int findMin(int[] nums) {
    int mid ;
    int first = 0 ; 
    int last = nums.length -1;
    while ( first < last){
         mid = first + (last - first) / 2 ;
        if(nums[mid] > nums[last]){
            first = mid + 1 ;
        }
        else{
            last = mid ;
        }
    }  
    return nums[first] ;
    }
}