class Solution {

public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

   /* public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.isEmpty())
            return 0;

        int i = 0;
        int j = 0;
        int fisrtChar = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (needle.charAt(j) == haystack.charAt(i)) {
                i++;
                j++;
            } else {
                fisrtChar++;
                j = 0;
                i = fisrtChar;
            }
        }

        if (j == needle.length()) {
            return fisrtChar;
        }

        return -1;

    }*/

    /**
      public int strStr(String haystack, String needle) {
         if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
     */
}
