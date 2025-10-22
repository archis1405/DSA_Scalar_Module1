package Sorting1_MergeAndCountSort;
/*
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.

Note: A linear time complexity is expected and you should avoid use of any library function.

Example:
A = [4, 7, 9]
B = [2, 11, 19]

Output: [2, 4, 7, 9, 11, 19]
 */


public class MergeTwoSortedArrays1 {
    public static int[] merge(int[] A , int[]B){
        int n = A.length;
        int m = B.length;

        int[] result = new int[m+n];

        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(A[i] <= B[j]){
                result[k]=A[i];
                i++;
                k++;
            }

            else{
                result[k]=B[j];
                j++;
                k++;
            }
        }

        while(i<n){
            result[k]=A[i];
            i++;
            k++;
        }
        while(j<n){
            result[k]=B[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {4, 7, 9};
        int[] B = {2, 11, 19};

        int[] result = merge(A,B);

        System.out.print("Merged array: ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
