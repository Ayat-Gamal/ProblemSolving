class Solution {
    public int maxArea(int[] height) {
        int j =  height.length - 1;
        int i= 0;
        int area = 0;
 
        while (i<j) {
            int currentWidth = j - i;
            int currentHeight = Math.min(height[i], height[j]);
            int currentArea = currentWidth * currentHeight;
            area = Math.max(area, currentArea);
            if (height[i] < height[j]) {
               i++;
            }else{j--;}
         }

        return area;
    }
}
