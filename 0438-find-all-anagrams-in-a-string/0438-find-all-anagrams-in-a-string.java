class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n)
            return ans;

        int[] pFreq = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < n; right++) {

            window[s.charAt(right) - 'a']++;

    
            if (right - left + 1 > m) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

        
            if (right - left + 1 == m) {
                if (Arrays.equals(window, pFreq)) {
                    ans.add(left);
                }
            }
        }

        return ans;
    }
}