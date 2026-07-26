class Solution {
    public int maximumProduct(int[] nums) {
   int max = Integer.MIN_VALUE;
   int secondmax = Integer.MIN_VALUE;
   int thirdmax = Integer.MIN_VALUE;
   int min = Integer.MAX_VALUE;
   int secondmin = Integer.MAX_VALUE;     
   for(int num : nums){
    if(num > max){
        thirdmax = secondmax;
        secondmax = max;
        max = num ;
    }else if(num > secondmax){
        thirdmax = secondmax;
        secondmax = num;
    }
    else if(num > thirdmax){
        thirdmax = num;
    }
    if(num < min){
        secondmin = min;
        min = num;
    }else if(num < secondmin){
        secondmin = num;
    }
   }
   return Math.max(max*secondmax*thirdmax , max*min*secondmin);
    }
}