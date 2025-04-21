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
        int actualCounter = 0;
        for (int num : nums) {
            if (num == majorityElemnt) {
                actualCounter++;
            }
        }

        if (actualCounter > (n / 2)) {  
            return majorityElemnt;
        }

        return -1;

        /**
        
        //hashMap
        HashMap<Integer, Integer> hMap = new HashMap();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            hMap.put(nums[i], hMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int key : hMap.keySet()) {
            if (hMap.get(key) > (n / 2)) {
                return key;
            }
        }
        return -1;
        
         */

    }
}