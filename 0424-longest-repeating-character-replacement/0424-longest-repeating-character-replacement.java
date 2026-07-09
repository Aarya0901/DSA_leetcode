class Solution {
    public int characterReplacement(String s, int k) {
    int[] counts = new int[26];
    int left = 0;
    int maxFreq = 0;
    int maxlen = 0;
    for(int right = 0; right < s.length(); right++){
        char rightchar = s.charAt(right);
        counts[rightchar - 'A']++;

        maxFreq = Math.max(
            maxFreq ,counts[rightchar - 'A']
        );
    while((right - left +1)-maxFreq > k){
        char leftchar = s.charAt(left);
        counts[leftchar - 'A']--;
        left++;
    } 
    maxlen = Math.max(
                maxlen,
                right - left + 1);
    }
    return maxlen ;
  }  
}