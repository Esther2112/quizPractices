import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        double avg = 0.0;
        double ratio = 0.0;
        int[] scores;

        while (count != 0){
            int sum = 0;
            int overAvgCount = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int stuNum = Integer.parseInt(st.nextToken());
            scores = new int[stuNum];

            for (int i = 0; i < scores.length; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
                sum += scores[i];
            }
            avg = (double) sum / stuNum;

            for (int score : scores) {
                if (score > avg) {
                    overAvgCount += 1;
                }
            }

            ratio = (double) overAvgCount / stuNum * 100;
            System.out.printf("%.3f%%\n", ratio);
            count--;
        }



    }
}