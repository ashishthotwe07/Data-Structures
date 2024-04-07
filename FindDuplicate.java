public class FindDuplicate {

    public static void main(String[] args) {
        // Create an array with duplicates
        int arr[] = { 1, 2, 4, 6, 3, 3 };

        // Call a function to find duplicates in the array
        System.out.println(findDuplicates(arr));
    }

    // Function to find duplicates in the array
    public static int findDuplicates(int arr[]) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int duplicate = arr[i];
            // Iterate through the elements after the current element
            for (int j = i + 1; j < arr.length; j++) {
                // If a duplicate is found, return it
                if (duplicate == arr[j]) {
                    return arr[j];
                }
            }
        }

        // If no duplicates are found, return 0
        return 0;
    }
}
