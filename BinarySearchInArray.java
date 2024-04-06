public class BinarySearchInArray {
    public static int binarySearch(int[] arr, int x) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] == x) {
                return mid;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 7, 8, 1, 9, 10, 15 };
        int target = 10;
        System.out.println(binarySearch(arr, target));

    }
}
