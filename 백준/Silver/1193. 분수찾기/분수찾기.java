import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quiz = Integer.parseInt(br.readLine());
        int line = 1;
        int block = 1;
        int start = 1;

        for (int i = 0; i < quiz; i++) {
            start += i;
            if (quiz >= start && quiz < start + (i + 1)) {
                line = i + 1;
                block = quiz - start + 1;

                if (line % 2 == 0) {
                    System.out.print(block + "/");
                    System.out.println(line - block + 1);
                } else {
                    System.out.print((line - block + 1) + "/");
                    System.out.println(block);
                }

                break;
            }
        }


    }

}


