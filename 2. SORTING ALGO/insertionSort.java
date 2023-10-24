public class insertionSort {
    public static void insertionSortAlgo(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out th r correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 7, 3, 6 };
        insertionSortAlgo(arr);
        printArr(arr);

    }
}
