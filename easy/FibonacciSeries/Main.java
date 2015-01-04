import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(fibonacci(Integer.parseInt(line)));
        }
    }

    private static int fibonacci(int n) {
        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        int fib0 = 0;
        int fib1 = 1;
        int fib = 0;

        for(int i = 2; i <= n; i++) {
            fib = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib;
        }

        return fib;
    }
}
