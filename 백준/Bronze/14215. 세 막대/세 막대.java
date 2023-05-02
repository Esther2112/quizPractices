import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];
        int max = 1;
        int min = 100;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max <= arr[i]){ max = arr[i];}
            if(min >= arr[i]){ min = arr[i];}
            sum += arr[i];
        }

        int mid = sum - max - min;

        if (sum - max <= max){
            System.out.println(sum - max + mid + min - 1);
        } else {
            System.out.println(sum);
        }

    }

}


