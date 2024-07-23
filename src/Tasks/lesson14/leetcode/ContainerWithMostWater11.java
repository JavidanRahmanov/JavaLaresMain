package Tasks.lesson14.leetcode;

public class ContainerWithMostWater11 {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            if (height[left] < height[right]) {

                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;

            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            }
        }
        return maxArea;
    }
}
