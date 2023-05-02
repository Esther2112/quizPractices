import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] triangle = new int[3];
        int sum = 0;
        int max = 0;
        int min = 180;
        for (int i = 0; i < 3; i++) {
            triangle[i] = Integer.parseInt(br.readLine());
        }

        for (int i : triangle) {
            sum += i;
            if(max < i){max = i;}
            if(min > i){min = i;}
        }

        if (sum != 180) {
            System.out.println("Error");
        } else if (max == 60) {
            System.out.println("Equilateral");
        } else if ((180 - max) == (2 * min) || (180 - min) == (2 * max)) {
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene");
        }


    }

}


