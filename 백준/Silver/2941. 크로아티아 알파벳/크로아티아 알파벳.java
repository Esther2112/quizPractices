import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String quiz = br.readLine();
        String replaced = "";
        int count = 0;

        String[] croAlpa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        outer:
        for (int i = 0; i < quiz.length(); i++) {

            for (int j = 0; j < croAlpa.length; j++) {
                if (quiz.contains(croAlpa[j])) {
                    replaced = quiz.replace(croAlpa[j], "a");
                    quiz = replaced;
                }
            }
        }

        count = quiz.length();
        System.out.println(count);
    }
}