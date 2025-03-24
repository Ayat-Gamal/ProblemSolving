class Solution {

    public int maximumCount(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int posative = nums.length - left;
         left = 0;
         right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int negative = left;

        return Math.max(posative, negative);
    }

    // public int maximumCount(int[] nums) {
    // int positive= 0; int negative = 0;

    // for(int i =0;i<nums.length;i++){
    // if(nums[i]>0){
    // positive ++;

    // }else if (nums[i] < 0) {
    // negative++;
    // }
    // }

    // return Math.max(positive,negative);
    // }
}