import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(br.readLine());
        int[] changes = {25, 10, 5, 1};
        int times;

        for (int j = 0; j < round; j++) {

            int paid = Integer.parseInt(br.readLine());
            for (int i = 0; i < changes.length; i++) {

                times = paid / changes[i];
                paid = paid % changes[i];

                System.out.print(times + " ");

            }
            System.out.println();

        }

    }

}


