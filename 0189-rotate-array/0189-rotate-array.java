class Solution {

    /**
    use reminder to get postion of moved eleemnts === k % n 
     as n umber of elemnts ina array
    
     solution 1 = use extra space  space O(N)
     solution 2 = in palce array,, we will use reverse
    
     */
    public void rotate(int[] nums, int k) {
        //  solution 2
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        /*    
            //  solution 1
            int n = nums.length;
              k = k % n;
                int [] rotated = new int [n]; 
              for(int i = 0; i< n ; i++){
                    rotated[(i +k)%n ] = nums[i];
              }
               for(int i = 0; i< n ; i++){
                    nums[i ] = rotated[i];
              }
        
            */
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}