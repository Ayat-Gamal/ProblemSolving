class Solution {

    /**
     * capablity = max money he can steal from one house of all housees [10, 5, 7 ,
     * 12] = 12
     * [10, 5, 7 , 2] = 10
     * [3, 5, 7 , 2] = 7
     * so, we return min(12, 10,7) = 7. <= MO OF capability !
     * 
     */
    public int minCapability(int[] nums, int k) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (helper(nums, k, mid)) {
                answer = mid;
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }
        return answer;

    }

    boolean helper(int[] nums, int k, int mid) {

        int i = 0;
        int n = nums.length;
        int count = 0;
        while (i < n) {
            if (nums[i] <= mid) {
                count++;
                i += 2; // no steal adjacent houses
            } else {
                i++;
            }

            if (count >= k) {
                return true;
            }
        }

        return count >= k;
    }
}