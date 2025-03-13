class Solution {

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = n; i > 0; i--) {

            int maxElemnt = findMax(arr, i);
            if (maxElemnt == i - 1) {
                continue;
            }

            if (maxElemnt != 0) {
                flip(arr, maxElemnt + 1);
                result.add(maxElemnt + 1);
            }
            flip(arr, i);
            result.add(i);
        }
        return result;
    }

    int findMax(int[] arr, int r) {
        int maxi = 0;
        for (int i = 0; i < r; i++) {
            if (arr[i] > arr[maxi])
                maxi = i;
        }
        return maxi;
    }

    void flip(int[] arr, int k) {
        int left = 0;
        int right = k - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            right--;
            left++;

        }
    }
}