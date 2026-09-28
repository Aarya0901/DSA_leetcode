class Solution {
    public int maxDepth(String s) {
     int count = 0 ;
     int maxdepth = 0 ;

     for(int i=0;i< s.length(); i++){
        char ch = s.charAt(i) ;

        if(ch == '('){
            count++; 
            maxdepth = Math.max(maxdepth , count) ;
        }
        else if(ch == ')'){
            count -- ;
        }
     }   

     return maxdepth ; 
    }
}