import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gameSet = br.readLine();
        StringTokenizer st1 = new StringTokenizer(gameSet, " ");
        int arrNo = Integer.parseInt(st1.nextToken());
        int count = Integer.parseInt(st1.nextToken());
        int[] arr = new int[arrNo];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = count; i > 0; i--) {
        String target = br.readLine();
        StringTokenizer st = new StringTokenizer(target, " ");
        int target1 = Integer.parseInt(st.nextToken());
        int target2 = Integer.parseInt(st.nextToken());
        int temp = arr[target1 - 1];
        arr[target1 - 1] = arr[target2 - 1];
        arr[target2 - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}