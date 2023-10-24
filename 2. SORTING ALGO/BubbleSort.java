public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // int turn =0;
        for (int turn = 0; turn <= n - 2; turn++) {

            int swap = 0;
            for (int j = 0; j <= n - 2 - turn; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swap++;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int []arr={5, 4, 1, 3, 2};
        int[] arr = { 1, 6, 3, 4, 5 };
        bubbleSort(arr);
        printArr(arr);
    }

}