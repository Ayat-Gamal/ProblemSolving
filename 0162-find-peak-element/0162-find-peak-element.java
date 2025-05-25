class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid;

        if (nums.length == 1)
            return r;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {

                r = mid;
            }

        }
        return l;
    }
}