import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double maxPerDay = Integer.parseInt(st.nextToken());
        double slip = Integer.parseInt(st.nextToken());
        double goal = Integer.parseInt(st.nextToken());
        double day = (goal - maxPerDay) / (maxPerDay - slip) + 1;
        System.out.print((int)Math.ceil(day));

    }

}


