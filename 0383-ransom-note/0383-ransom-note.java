class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] freq = new int[26];

    
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, freq[c % 26]);

            if (i == -1) {
                return false;
            }
            freq[c % 26 ] = i +1;
        }

        return true;

    }
}