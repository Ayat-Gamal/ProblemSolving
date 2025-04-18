class Solution {

    /**
    use reminder to get postion of moved eleemnts === k % n 
     as n umber of elemnts ina array

     solution 1 = use extra space
     */
    public void rotate(int[] nums, int k) {
            int n = nums.length;
              k = k % n;
                int [] rotated = new int [n]; 
              for(int i = 0; i< n ; i++){
                    rotated[(i +k)%n ] = nums[i];
              }
               for(int i = 0; i< n ; i++){
                    nums[i ] = rotated[i];
              }

            
    }
}