class Solution {

    /**
     * 0:25
     * //freq array better as it only lower characters and already sorted
     * a b c d e f g h ....z 
     * 1 1 1 1 0 0
     * 
     */

    public String customSortString(String order, String s) {
        StringBuilder answer = new StringBuilder();
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        char letter = 'a';
        int frqeLetter = 0;


        for(int i =0 ; i<order.length(); i++){
                if(freq[order.charAt(i)- 'a'] > 0) // exist in s
                letter = order.charAt(i);
                frqeLetter = freq[order.charAt(i)- 'a'];


                for(int j =0; j<frqeLetter; j++){
                    answer.append(letter);
                    freq[letter - 'a']--;
                }
        }

        for(int i =0 ; i<26 ; i++){ // for letters not in order string
            if(freq[i] > 0 )
            {
                for(int j = 0; j<freq[i] ; j++ ){
                    answer.append((char)(i+'a')); //to put the char in his place in new string 
                }
            }

        }
        return answer.toString();

    }
}