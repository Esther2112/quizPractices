import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int totalNum = 0;
        int count = 0;

        for (int i = 0; i < num; i++) {
        int target = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= target; j++) {
                if(target % j == 0){
                    count++;
                }
            }
            if(count == 2){
                totalNum++;
            }
            count = 0;
        }
        System.out.println(totalNum);

    }

}


