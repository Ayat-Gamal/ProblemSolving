class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // remove spaces from both ends of a string.
        int i = s.length()-1; //to traverse form end of the string and apped each char unitl found first space and then break!
        StringBuilder str = new StringBuilder();
        while(i < s.length() && i>=0){
            if(s.charAt(i)== ' ')
                break;
            str.append(s.charAt(i));
            i--;
        }
        return str.toString().length();
    }
}