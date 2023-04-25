import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str, " ");
        int len = Integer.parseInt(st1.nextToken());
        int target = Integer.parseInt(st1.nextToken());
        int count = 0;

        String strArr = br.readLine();
        StringTokenizer st2 = new StringTokenizer(strArr, " ");
        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i : arr) {
            if(i < target){
                System.out.print(i + " ");
            }
        }
    }
}