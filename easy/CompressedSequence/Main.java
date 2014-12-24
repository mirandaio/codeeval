import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            compress(line);
        }
    }

    private static void compress(String sequence) {
        String[] numbers = sequence.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 0;

        while(i < numbers.length) {
            String current = numbers[i];
            int count = 1;
            int j = i + 1;

            while(j < numbers.length && current.equals(numbers[j])) {
                count++;
                j++;
            }

            result.append(count);
            result.append(' ');
            result.append(current);
            result.append(' ');
            i = j;
        }

        System.out.println(result.toString());
    }
}
