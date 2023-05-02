import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int denominator = 2;

        while(num >= 1){
            if(num == 1) break;
            if(num % denominator == 0){
                num = num / denominator;
                System.out.println(denominator);
            }else {
                denominator++;
            }
        }

    }

}


