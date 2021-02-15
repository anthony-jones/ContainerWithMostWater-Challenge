class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length; i++){
            for(int c = i + 1; c < height.length; c++){
                int width = c - i;
                int length = Math.min(height[i], height[c]);
                int tempArea = width*length;
                if(tempArea > maxArea){
                    maxArea = tempArea;
                }
            }
        }
        return maxArea;
    }
}

// Could be consolidated but is not for readability & understandability
