import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String quizSet = "";
        String subject = "";
        double credit;
        String grade;
        double creditSum = 0;
        double denominator = 0;

        for (int i = 0; i < 20; i++) {
            quizSet = br.readLine();
            StringTokenizer st = new StringTokenizer(quizSet, " ");
            subject = st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if(!grade.equals("P")){
                denominator += credit;
            }

            switch (grade){
                case "A+" : credit *= 4.5; break;
                case "A0" : credit *= 4.0; break;
                case "B+" : credit *= 3.5; break;
                case "B0" : credit *= 3.0; break;
                case "C+" : credit *= 2.5; break;
                case "C0" : credit *= 2.0; break;
                case "D+" : credit *= 1.5; break;
                case "D0" : credit *= 1.0; break;
                case "F" : credit *= 0.0; break;
                case "P" : credit *= 0; break;
            }

            creditSum += credit;

        }

        System.out.println(creditSum / denominator);


    }
}