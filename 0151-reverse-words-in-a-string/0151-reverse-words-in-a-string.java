class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0)
                break; 

            int start = end;
      
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
 
            if (result.length() > 0) {
                result.append(' ');
            }
            result.append(s, start + 1, end + 1);

            end = start;
        }

        return result.toString();

        /* 
        String[] words = s.trim().split("\\s+"); // remove spaces from both ends of a string and split each word, trim() o(N)
        
        StringBuilder str = new StringBuilder();
        int start = 0;
        int end = words.length - 1;
        
        for (int i = end; i >= 0; i--) {
            str.append(words[i]);
            if (i > 0) {
                str.append(" ");
            }
        }
        return str.toString();
        */
    }

}