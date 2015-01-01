import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            evenNumbers(line);
        }
    }

    private static void evenNumbers(String str) {
        if(Integer.parseInt(str) % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
