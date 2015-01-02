import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            withoutRepetitions(line);
        }
    }

    private static void withoutRepetitions(String line) {
        if(line.length() == 0)
            return;

        StringBuilder result = new StringBuilder();
        result.append(line.charAt(0));
        char c;

        for(int i = 1; i < line.length(); i++) {
            c = line.charAt(i);
            if(c != line.charAt(i - 1))
                result.append(c);
        }

        System.out.println(result);
    }
}
