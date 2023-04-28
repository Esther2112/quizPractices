import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] quizArr = new int[9][9];
        int max = quizArr[0][0];
        int outer = 0;
        int inner = 0;

        for (int i = 0; i < quizArr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < quizArr[i].length; j++) {
                quizArr[i][j] = Integer.parseInt(st.nextToken());
                if (quizArr[i][j] >= max) {
                    max = quizArr[i][j];
                    outer = i + 1;
                    inner = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(outer + " " + inner);


    }


}