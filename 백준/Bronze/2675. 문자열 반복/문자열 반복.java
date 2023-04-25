import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (count != 0) {
            String quizSet = br.readLine();
            StringTokenizer st = new StringTokenizer(quizSet, " ");
            int iter = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < iter; j++) {
                    sb.append(str.charAt(i));
                }
            }
            sb.append("\n");
            count--;
        }
        System.out.println(sb);

    }
}