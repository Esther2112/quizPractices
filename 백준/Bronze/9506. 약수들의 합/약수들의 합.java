import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int num = Integer.parseInt(br.readLine());
            if(num == -1) break;
            StringBuilder success = new StringBuilder();
            StringBuilder isNot = new StringBuilder(num + " is NOT perfect.");
            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    if (i == 1) {
                        success.append(num).append(" = ").append(i);
                    } else {
                        success.append(" + ").append(i);
                    }
                }
            }
            if (num == sum) {
                System.out.println(success);
            } else {
                System.out.println(isNot);
            }

        }
    }

}


