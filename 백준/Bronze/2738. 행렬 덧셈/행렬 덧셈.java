import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String quizSet = br.readLine();
        StringTokenizer st = new StringTokenizer(quizSet, " ");
        int outer = Integer.parseInt(st.nextToken());
        int inner = Integer.parseInt(st.nextToken());

        int[][] a = new int[outer][inner];
        int[][] b = new int[outer][inner];

        for (int i = 0; i < a.length; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < b.length; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = Integer.parseInt(st3.nextToken());
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}