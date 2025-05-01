class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int left = 0;
        int maxLength = 0;
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (hs.contains(ch)) {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);

            maxLength = Math.max(maxLength, i - left + 1); //the sindow size!

        }

        return maxLength;
    }
}