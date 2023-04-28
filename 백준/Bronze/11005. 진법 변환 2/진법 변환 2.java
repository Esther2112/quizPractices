import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int decimal = Integer.parseInt(st.nextToken());
        int origin = Integer.parseInt(st.nextToken());
        int devided = 0;
        StringBuilder save = new StringBuilder();

        while(decimal != 0) {
            devided = decimal % origin;
            if (devided > 9) {
                save.append((char) (devided + 55));
            } else {
                save.append(devided);
            }
            decimal = decimal / origin;
        }
        save.reverse();
        System.out.println(save);
    }

}


