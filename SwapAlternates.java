public class SwapAlternates {
    public static void swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length; i += 2) {

            if (i == arr.length - 1 && i % 2 == 0) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };

        swapAlternate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
