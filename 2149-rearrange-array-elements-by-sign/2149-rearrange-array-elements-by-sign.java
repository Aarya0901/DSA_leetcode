class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans = new int[nums.length];
        int posInd =0;
        int negInd =1;
        for(int num : nums){
            if(num >0){
                ans[posInd]=num;
                posInd+=2;
            }else{
                ans[negInd]=num;
                negInd+=2;
            }
        }
        return ans;
    }
}