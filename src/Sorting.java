import java.util.Scanner;

public class Sorting {

    public static int[] sort(int[] arr) {
        int x;
        int j;
        for (int i = 1 ; i < arr.length ; i++) {
            x = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int idx = 0 ; idx < arr.length - 1 ; idx++) {
            System.out.printf(" %d,", arr[idx]);
        }
        System.out.printf(" %d ]", arr[arr.length-1]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me list of numbers: ");
        String[] line = sc.nextLine().split(" ");
        int length = line.length;
        int[] arr = new int[length];
        for (int idx = 0 ; idx < length ; idx++) {
            arr[idx] = Integer.parseInt(line[idx]);
        }
        printArr(sort(arr));
        sc.close();
    }
}