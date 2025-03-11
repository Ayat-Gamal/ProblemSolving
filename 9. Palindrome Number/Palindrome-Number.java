class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

       // if(x == 0) return true;
        if (s.length() == 1) {
           return true;
        }else {
            while (left < right) {
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        
    }
}