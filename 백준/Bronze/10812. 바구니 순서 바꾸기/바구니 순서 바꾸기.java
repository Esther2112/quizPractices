import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int len = Integer.parseInt(st1.nextToken());
        int count = Integer.parseInt(st1.nextToken());
        int[] arr = new int[len];
        int[] newArr;

        for (int i = 0; i < len; i++) {
            arr[i] = i + 1;
        }

        while (count != 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int begin = Integer.parseInt(st2.nextToken()) - 1;
            int end = Integer.parseInt(st2.nextToken()) - 1;
            int pivot = Integer.parseInt(st2.nextToken()) - 1;
            newArr = new int[len];

            for (int i = 0; i < begin; i++) {
                newArr[i] = arr[i];
            }

            for (int i = 0; i < end - pivot + 1; i++) {
                newArr[begin + i] = arr[pivot + i];
            }

            for (int i = 0; i < pivot - begin; i++) {
                newArr[begin + end - pivot + 1 + i] = arr[begin + i];
            }

            for (int i = 1; i < len - end; i++) {
                    newArr[end + i] = arr[end + i];
            }

            arr = newArr;
            count--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}