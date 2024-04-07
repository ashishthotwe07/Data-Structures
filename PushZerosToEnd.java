public class PushZerosToEnd {

    public static void pushZerosToEnd(int arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1 };

        pushZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
