public class InsertionSort {
    public static void insertionSort(int arr[]) {
        // Iterate over each element in the array, starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Store the current element to be inserted into the sorted subarray
            int current = arr[i];

            // Initialize a pointer to the element just before the current element
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than current,
            // to one position ahead of their current position
            // This loop shifts elements to the right to make space for the current element
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--; // Move the pointer to the left
            }

            // Insert the current element into its correct sorted position
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 2, 3, 1 };

        // Sort the array using insertion sort
        insertionSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
