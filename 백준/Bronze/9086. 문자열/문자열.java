import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            String str = br.readLine();
            System.out.printf("%c%c\n", str.charAt(0), str.charAt(str.length()-1));
        }
    }
}