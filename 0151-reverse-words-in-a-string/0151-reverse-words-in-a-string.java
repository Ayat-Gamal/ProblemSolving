class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // remove spaces from both ends of a string and split each word

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

    }

}