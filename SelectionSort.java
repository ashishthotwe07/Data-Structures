public class SelectionSort {
    // Function to perform selection sort on the given array
    public static void selectionSort(int arr[]) {
        // Outer loop iterates over each element of the array, except the last one
        // It selects the minimum element from the unsorted portion of the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current element is the minimum
            int min = i;
            // Inner loop iterates over the unsorted portion of the array
            // It finds the index of the minimum element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                // Compare the current element with the minimum element found so far
                if (arr[j] < arr[min]) {
                    // If a smaller element is found, update the index of the minimum element
                    min = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to test the selection sort function
    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = { 2, 4, 6, 8, 3, 5, 7 };

        // Sort the array using selection sort
        selectionSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
