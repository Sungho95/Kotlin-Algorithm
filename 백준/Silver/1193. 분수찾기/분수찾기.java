import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int crossCount = 1;
        int prevCountSum = 0;

        while (true) {
            if (x <= crossCount + prevCountSum) {
                if (crossCount % 2 == 0) {
                    int a = x - prevCountSum;
                    int b = crossCount - (x - prevCountSum - 1);

                    System.out.println(a + "/" + b);
                    break;
                } else {
                    int a = crossCount - (x - prevCountSum - 1);
                    int b = x - prevCountSum;

                    System.out.println(a + "/" + b);
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}