import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int count = 10;
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < arr.length; i++) {
                if(i == arr.length - 1){
                    break;
                }
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}