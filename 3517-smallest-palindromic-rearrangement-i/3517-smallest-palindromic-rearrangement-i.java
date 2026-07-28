class Solution {
    public String smallestPalindrome(String s) {
     int[] freq = new int[26];
     int   n = s.length();
     for(int i=0; i<n ; i++){
        char ch = s.charAt(i);
        freq[ch-'a']++;
     }   
     char[] ans = new char[s.length()];
     int left = 0; 
     int right = s.length()-1;
     char middle = ' ';

     for(int i=0; i<26 ; i++){
        while(freq[i] >= 2){
            ans[left] = (char)('a'+i);
            ans[right] = (char)('a'+i);

            left++;
            right--;
            freq[i]=freq[i]-2;
        }
        if(freq[i] == 1){
            middle =(char)('a'+i);
        }
     }
     if(middle != ' '){
        ans[left] = middle;
     }
     return new String(ans);
    }
}