class Solution {
    /**
     * we can  use HashSet() !! wow O(n),, also HashMap sapce O(n)
     * add and remove the element, at end if empty => true lese fasle 
     */

    public boolean divideArray(int[] nums) {

        if (nums.length % 2 != 0)
            return false;

        HashSet set = new HashSet<Integer>();

        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return set.isEmpty();
        /*
         * int n = nums.length;
         * if (n % 2 != 0)
         * return false;
         * 
         * HashMap<Integer, Integer> map = new HashMap<>();
         * for (int i = 0; i < n; i++) {
         * map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         * }
         * for (int count : map.values()) {
         * if (count % 2 != 0) {
         * return false;
         * }
         * }
         * return true;
         */
    }
}