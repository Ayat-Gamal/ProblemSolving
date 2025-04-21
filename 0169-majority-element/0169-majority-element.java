class Solution {
    /*
    frequency array, or hashMap
        but for O(1) space
     */
    public int majorityElement(int[] nums) {
        // O(1) space

        int n = nums.length;
        int majorityElemnt = 0;
        int voteCounter = 0;

        for (int i = 0; i < n; i++) {
            if (voteCounter == 0) {
                voteCounter = 1;
                majorityElemnt = nums[i];

            } else if (nums[i] == majorityElemnt) {
                majorityElemnt = nums[i];
                voteCounter++;

            } else {
                voteCounter--;
            }
        }

        //	verifying
        int actulaCounter = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == majorityElemnt) {
                actulaCounter++;
            }
        }
        if (actulaCounter++ > (n / 2)) {
            return majorityElemnt;
        }

        return -1;

    }
}