import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        long sum = 0;
        for (long i = n - 2; i > 0 ; i--) {
            sum += i * (i + 1) / 2;
        }
        System.out.println(sum);
        System.out.println(3);

    }

}


