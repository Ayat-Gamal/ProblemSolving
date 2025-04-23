class Solution {
    /**
    a b c --  a h b g d c 
        p2              p2
    if(p1 == p2) p11++,p2+++;
    else p2++
     */
    
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        int n = s.length();
        int m = t.length();
        while (p1 < n && p2 < m) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;

            } else {
                p2++;
            }
        }

        if (p1 == n) {//check if firrst string is finished
            return true;
        }
        return false;
    }
}