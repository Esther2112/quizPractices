import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int count = 0;
        String strArr = br.readLine();
        StringTokenizer st = new StringTokenizer(strArr, " ");
        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        for (int i : arr) {
            if(i == target){
                count++;
            }
        }
        System.out.println(count);
    }
}