import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = generateDivisorCount(n);

        if (count < k) {
            System.out.println(0);
        } else {
            int[] divisors = generateDivisors(n, count);
            System.out.println(divisors[k - 1]);
        }
    }

    private static int generateDivisorCount(int n) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i * i == n) {
                count++;
            } else if (n % i == 0) {
                count += 2;
            }
        }

        return count;
    }

    private static int[] generateDivisors(int n, int count) {
        int[] divisors = new int[count];
        int idx = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i * i == n) {
                divisors[idx] = i;
                idx++;
            } else if (n % i == 0) {
                divisors[idx] = i;
                divisors[divisors.length - idx - 1] = n / i;
                idx++;
            }
        }

        return divisors;
    }
}