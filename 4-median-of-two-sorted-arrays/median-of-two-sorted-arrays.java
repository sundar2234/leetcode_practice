class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] arr = new int[m + n];
        int m1 = 0, n1 = 0, i = 0;
        double median;

        // Merge nums1 and nums2 into arr[]
        while (m1 < m && n1 < n) {
            if (nums1[m1] <= nums2[n1]) {
                arr[i++] = nums1[m1++];
            } else {
                arr[i++] = nums2[n1++];
            }
        }

        // Copy remaining elements from nums1
        while (m1 < m) {
            arr[i++] = nums1[m1++];
        }

        // Copy remaining elements from nums2
        while (n1 < n) {
            arr[i++] = nums2[n1++];
        }

        // Find the median
        int len = m + n;
        if (len % 2 == 0) {
            median = (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            median = arr[len / 2];
        }

        return median;
    }
}