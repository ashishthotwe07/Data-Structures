public class FindIntersection {
    public static int[] findIntersection(int arr1[], int arr2[]) {
        // Count the number of intersection elements
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    break;
                }
            }
        }

        // Initialize the intersection array with the correct size
        int[] arr = new int[count];
        int index = 0;

        // Store the intersection elements in the array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr[index++] = arr1[i];
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 8, 4, 5 };
        int arr2[] = { 4, 6, 7, 8, 5 };

        // Find and print the intersection array
        int[] intersection = findIntersection(arr1, arr2);
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
