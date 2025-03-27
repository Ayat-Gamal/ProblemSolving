class Solution {
    /**
     * if
     * last digit <9 icrement it and retrurn th array direclty,
     * else
     * make the last digit = 0 and take the carry back for other elemnts
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}