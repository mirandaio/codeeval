import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            penultimate(line);
        }
    }

    private static void penultimate(String line) {
        int start;
        int end = line.length() - 1;

        while(end >= 0 && line.charAt(end) != ' ')
            end--;

        start = end - 1;

        while(start >= 0 && line.charAt(start) != ' ')
            start--;

        System.out.println(line.substring(start + 1, end));
    }
}
