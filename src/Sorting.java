import java.util.Scanner;

public class Sorting {
    
    /* Insertion sort algorithm */
    public static int[] sort(int[] arr) {
        int x;
        int j;
        for (int idx = 1 ; idx < arr.length ; idx++) {
            x = arr[idx];
            j = idx - 1;
            while (j >= 0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
        return arr;
    }
    /* Method for printing an int[] */
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int idx = 0 ; idx < arr.length - 1 ; idx++) {
            System.out.printf("\'%d\', ", arr[idx]);
        }
        System.out.printf("\'%d\']", arr[arr.length-1]);
        System.out.println();
    }
    /* Main method */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me list of numbers: ");
        String[] line = sc.nextLine().trim().split(" ");
        int length = line.length;
        int[] arr = new int[length];
        for (int idx = 0 ; idx < length ; idx++) {
           try {
            arr[idx] = Integer.parseInt(line[idx]);
            }
            catch (NumberFormatException err) {
                System.out.printf("Please list only numbers: %s", err);
            }
        }
        printArr(sort(arr));
        sc.close();
    }
}
