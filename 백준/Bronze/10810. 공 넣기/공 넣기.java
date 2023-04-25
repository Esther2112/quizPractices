import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gameSet = br.readLine();
        StringTokenizer st = new StringTokenizer(gameSet, " ");
        int basketNo = Integer.parseInt(st.nextToken());
        int[] arr = new int[basketNo];
        int count = Integer.parseInt(st.nextToken());

        while(count != 0) {
            String ballSet = br.readLine();
            StringTokenizer st1 = new StringTokenizer(ballSet, " ");
            int startIndex = Integer.parseInt(st1.nextToken());
            int endIndex = Integer.parseInt(st1.nextToken());
            int ballNum = Integer.parseInt(st1.nextToken());
            for (int i = startIndex - 1; i <= endIndex - 1; i++) {
                arr[i] = ballNum;
            }
            count--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}