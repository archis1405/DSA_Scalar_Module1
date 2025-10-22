package Sorting1_MergeAndCountSort;

/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
 */
public class MergeTwoSortedArrays2 {
    public static int[] merge(int[] A , int[] B , int m , int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && A[i] > B[j]) {
                A[k] = A[i];
                i--;
                k--;
            }
            else {
                A[k] = B[j];
                j--;
                k--;
            }

        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        int m=3;
        int n=3;

        int[] result = merge(A,B,m,n);

        System.out.print("Merged array: ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
