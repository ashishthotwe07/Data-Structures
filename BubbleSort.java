public class BubbleSort {
    // Function to perform bubble sort on the given array
    public static void bubbleSort(int arr[]) {
        // Outer loop iterates over each element of the array except the last one
        // It controls the number of passes through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop iterates over the unsorted portion of the array
            // It compares adjacent elements and swaps them if they are in the wrong order
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the bubble sort function
    public static void main(String[] args) {
        // Example array to be sorted
        int arr[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

        // Sort the array using bubble sort
        bubbleSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
