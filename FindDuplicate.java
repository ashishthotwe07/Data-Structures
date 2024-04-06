public class FindDuplicate {

    public static void main(String[] args) {
        // Create an array with duplicates
        int arr[] = { 1, 2, 4, 6, 3, 3 };

        // Call a function to find duplicates in the array
        System.out.println(findDuplicates(arr));
    }

    public static int findDuplicates(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int duplicate = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (duplicate == arr[j]) {
                    return arr[j];
                }
            }
        }

        return 0;
    }

}
