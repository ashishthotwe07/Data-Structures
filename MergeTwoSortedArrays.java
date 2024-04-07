public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int arr1[], int arr2[]) {

        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        // Copy the remaining elements from the first array, if any
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        // Copy the remaining elements from the second array, if any
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 4, 5, 6 };

        int arr3[] = mergeTwoSortedArrays(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
