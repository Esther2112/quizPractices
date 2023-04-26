import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        StringBuilder reversed = sb.reverse();
        String num1 = reversed.substring(0, 3);
        String num2 = reversed.substring(4, 7);

        System.out.println(num1.compareTo(num2) > 0 ? num1 : num2);
    }
}