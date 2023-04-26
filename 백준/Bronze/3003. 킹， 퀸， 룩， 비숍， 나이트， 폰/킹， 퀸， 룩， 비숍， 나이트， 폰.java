import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] rightSet = new int[]{1, 1, 2, 2, 2, 8};
        int[] quizSet = new int[rightSet.length];

        for (int i = 0; i < quizSet.length; i++) {
            quizSet[i] = rightSet[i] - Integer.parseInt(st.nextToken());
        }

        for (int i : quizSet) {
            System.out.print(i + " ");
        }

    }
}