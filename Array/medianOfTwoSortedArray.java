package com.unicorn.ArrayExamples;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double result;
		int[] mergedArray = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
	    System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
	    Arrays.sort(mergedArray);
	    if (mergedArray.length % 2 == 0) {
	    	int mid = mergedArray.length / 2;
	    	result = (double)(mergedArray[mid] + mergedArray[mid - 1]) / 2;
	    } else {
	    	result = (double)mergedArray[mergedArray.length / 2];
	    }
		return result;
	}

	public static void main(String[] args) {
		int nums1[] = {1,2};
		int nums2[] = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
