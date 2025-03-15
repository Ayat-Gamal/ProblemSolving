import java.util.Arrays;

class Solution {
    /**
     * 1- sort dim of each cuboid ASCE
     * 2 - all oreinttions {Box class to rebresent each cuboid l,h,w} one is enought
     * as we sort it
     * - sort baseed on ( l *w) base area 
     * l1 < l2
     * w1 < w2
     * => l1 w1 < l2 w2 (base area) l *w
     * 3 - init lis array => also we can say it the DP array
     * 4 - traverse over the array with i, j ,, wih this conidtion
     * condition => arr[i].l < arr[j].l && arr[i].w < arr[j].w && lis[i] < lis[j] +
     * arr[i].h
     * heigh is what will be traverse on as we need to c
     * 5 - get mx value of lis array
     * 
     */

    static class Box {
        int l, w, h;

        Box(int l, int w, int h) {
            this.l = l;
            this.w = w;
            this.h = h;
        }
    }

    public int maxHeight(int[][] cuboids) {
        int n = cuboids.length;
        if (n == 0)
            return 0;
        for (int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }

        Arrays.sort(cuboids, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            if (a[1] != b[1])
                return a[1] - b[1];
            return a[2] - b[2];
        });
        
        Box[] arr = new Box[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Box(
                            cuboids[i][0],
                            cuboids[i][1], 
                            cuboids[i][2]
                        );
        }

        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = arr[i].h; // [ list of heights of given cuboids]
        }

        int maxHeight = lis[0];
        for (int i = 1; i < n; i++) {
            lis[i] = arr[i].h;
            for (int j = 0; j < i; j++) {

                if (arr[i].l >= arr[j].l && arr[i].w >= arr[j].w && arr[i].h >= arr[j].h) {
                    lis[i] = Math.max(lis[i], lis[j] + arr[i].h);
                }
            }
            maxHeight = Math.max(maxHeight, lis[i]);
        }

        return maxHeight;
    }
}