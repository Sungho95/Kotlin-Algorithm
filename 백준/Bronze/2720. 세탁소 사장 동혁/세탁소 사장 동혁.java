import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] change = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());

            for (int j = 0; j < change.length; j++) {
                sb.append(c / change[j] + " ");
                c %= change[j];
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}