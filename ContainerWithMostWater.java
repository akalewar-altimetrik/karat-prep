public class ContainerWithMostWater {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int maxWater = 0;
            while (left < right) {
                if (Math.max(maxWater, Math.min(height[left], height[right]) * (right - left)) > maxWater) {
                    maxWater = Math.min(height[left], height[right]) * (right - left);
                }
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxWater;
        }
}
