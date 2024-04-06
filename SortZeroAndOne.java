public class SortZeroAndOne {

    public static int[] sortZeroesAndOne(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count += 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1 };

        int arr1[] = sortZeroesAndOne(arr);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
