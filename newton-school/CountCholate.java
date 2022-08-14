import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountCholate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        // index 0 1 2 3 4
        // value 0 0 0 0 0

        // update value from user input
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        // let studentName = [1, 2, 4];
        // studentName[3] = 10;

        //

        // int count = 0;
        // for (int i = 0; i < N; i++){
        // if (array[i] <= count){
        // count++;
        // }
        // }
        // return count;
    }
}