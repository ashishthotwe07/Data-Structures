public class BinarySearchInArray {
    // Binary search function to find the index of the target element in the sorted array
    public static int binarySearch(int[] arr, int x) {
        // Initialize the start and end pointers for the search range
        int start = 0;
        int end = arr.length - 1;

        // Continue searching while the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = (start + end) / 2;

            // If the middle element is less than the target, update the start pointer to search in the right half
            if (arr[mid] < x) {
                start = mid + 1;
            }
            // If the middle element is equal to the target, return the index of the target element
            else if (arr[mid] == x) {
                return mid;
            }
            // If the middle element is greater than the target, update the end pointer to search in the left half
            else {
                end = mid - 1;
            }
        }

        // If the target element is not found in the array, return -1
        return -1;
    }

    // Main method to test the binary search function
    public static void main(String[] args) {
        // Example array and target element
        int arr[] = { 3, 4, 5, 7, 8, 1, 9, 10, 15 };
        int target = 10;

        // Call the binary search function and print the result
        System.out.println(binarySearch(arr, target));
    }
}
