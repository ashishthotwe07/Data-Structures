/**
 * PrintAllPairs
 */
public class PrintAllPairs {

    public static void printallPairs(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6 };
        printallPairs(arr);

    }

}