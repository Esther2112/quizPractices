import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int total = 0;
        int min = num2;
        int max = 0;
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                total += i;
                if(i < min) min = i;
                if(i > max) max = i;
            }
            count = 0;
        }
        if (total != 0) {
            System.out.println(total);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }

}


