import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String quizSet = br.readLine();
        int sum = 0;

        for (int i = 0; i < count; i++) {
           sum += quizSet.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}