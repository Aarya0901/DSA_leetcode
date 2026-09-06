class Solution {
    public String largestNumber(int[] nums) {
       String[] arr = new String[nums.length] ;

       for(int i=0; i < nums.length ; i++){
        arr[i] = String.valueOf(nums[i]);
       }

       Arrays.sort(arr , (a,b) -> {
            String ab = a + b;
            String ba = b + a ;
            return ba.compareTo(ab) ;
       });

       StringBuilder ans = new StringBuilder();

       for(String s: arr){
        ans.append(s);
       }
       if(ans.charAt(0) == '0'){
        return "0";
       }

       return ans.toString(); 
    }
}