class Solution {

    /** what about start from end ?
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // normal approach
        int i = 0;
        int j = 0;
        int ptr = 0;
        int[] temp = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[ptr++] = nums1[i++];
            } else {
                temp[ptr++] = nums2[j++];
            }
        }

        while (i < m) {
            temp[ptr++] = nums1[i++];
        }
        while (j < n) {
            temp[ptr++] = nums2[j++];
        }

        for (int x= 0; x< (m + n); x++) {
            nums1[x ] = temp[x];
        }
        //from last
        /*  int i = m-1;
        int j = n-1;
        int last = nums1.length-1;
        while(j >=0 ){
        
            if( i>= 0 && nums1[i] > nums2[j]){
                nums1[last] = nums1[i];
                last--;
                i--;
            }else{
                nums1[last] = nums2[j];
                last--;
                j--;
            }
        }*/

    }
}