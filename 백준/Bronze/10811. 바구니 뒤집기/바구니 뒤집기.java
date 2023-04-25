import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String quizSet = br.readLine();
        StringTokenizer st1 = new StringTokenizer(quizSet, " ");
        int basketNo = Integer.parseInt(st1.nextToken());
        int count = Integer.parseInt(st1.nextToken());

        int[] arr = new int[basketNo];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        while (count != 0) {
            String switchSet = br.readLine();
            StringTokenizer st2 = new StringTokenizer(switchSet, " ");
            int start = Integer.parseInt(st2.nextToken()) - 1;
            int end = Integer.parseInt(st2.nextToken()) - 1;
            int len = (end - start + 1) / 2;

            for (int i = 0; i < len; i++) {
                int temp = arr[start + i];
                arr[start + i] = arr[end - i];
                arr[end - i] = temp;
            }
            count--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}