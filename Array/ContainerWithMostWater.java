package com.unicorn.searching;
import java.util.Iterator;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
	}
	
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxWater = 0;
		while(left < right) {
			if (height[left] <= height[right]) {
				if ((height[left] * (right - left)) > maxWater) {
					maxWater = height[left] * (right - left);
				}
				left++;
			} else if (height[right] <= height[left]) {
				if ((height[right] * (right - left)) > maxWater) {
					maxWater = height[right] * (right - left);
				}
				right--;
			} else {
				left++;
				right--;
			}
		}
		return maxWater;
	}
}
