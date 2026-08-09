class Solution {
    int[][] dp ;
    int[] prefix ;

    public int stoneGameII(int[] piles) {
        int n = piles.length ;
        dp = new int[n][n+1];
        prefix =  new int[n+1]; 
        for(int i=0 ; i<n; i++){
            prefix[i+1] = prefix[i] + piles[i];
         }       
        return solve(piles , 0 , 1) ;
    }

    int solve(int[] piles , int i , int M){
        if(i+2*M >= piles.length){
            return prefix[piles.length]-prefix[i] ;
        }

        if(dp[i][M] != 0){
            return dp[i][M] ;
        }
        int best= 0;
        for(int X=1 ; X<= 2*M ; X++){
            int taken = prefix[i + X]-prefix[i]; 

            int opponent = solve(piles , i+X , Math.max(M,X));
            int remaining = prefix[piles.length] - prefix[i+X] ;
            int current = taken + (remaining - opponent) ;
            best = Math.max(best , current) ;
        }
        dp[i][M] = best ;
        return best ;
    }
}