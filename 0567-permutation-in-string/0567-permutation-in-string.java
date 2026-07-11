class Solution {
    public boolean checkInclusion(String s1, String s2) {
  if(s1.length()> s2.length()){
    return false;
  }
  int[] s1Freq = new int[26];
  int[] s2Freq = new int[26];

  for(int i=0;i<s1.length();i++){
    s1Freq[s1.charAt(i)-'a']++;
    s2Freq[s2.charAt(i)-'a']++;
  }
  if(matches(s1Freq , s2Freq)){
    return true;
  }
  int i=0;
  for(int j=s1.length();j<s2.length();j++){
    s2Freq[s2.charAt(j)-'a']++;
    s2Freq[s2.charAt(i)-'a']--;
    i++;

    if(matches(s1Freq , s2Freq)){
        return true;
    }
  }
  return false;
    }
      private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
      }
}