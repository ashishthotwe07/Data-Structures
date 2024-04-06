public class FindUnique {

    public static int findUnique(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int unique = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique++;
                }

            }
            if (unique == 1) {
                return arr[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 2, 3, 3, 4, 5, 5 };
        int unique = findUnique(arr);
        System.out.println(unique);
    }
}
