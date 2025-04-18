class Solution {

    /**
    use reminder to get postion of moved eleemnts === k % n 
     as n umber of elemnts ina array
    
     solution 1 = use extra space  space O(N)
     solution 2 = in palce array,, we will use reverse
            1 2 3 4 5 6 7    k = 3   k%n = 3% 7 = 3
    rev 1:  7 6 5 4 3 2 1
    rev 2:  5 6 7 4 3 2 1
    rev 3:  5 6 7 1 2 3 4 


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