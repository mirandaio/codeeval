import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            dataRecovery(line);
        }
    }

    private static void dataRecovery(String line) {
        StringBuilder result = new StringBuilder();
        String[] parts = line.split(";");
        String[] words = parts[0].split(" ");
        int n = words.length;
        String[] sentence = new String[n];
        String[] positions = parts[1].split(" ");
        int sum = 0;
        int missingPos;

        for(int i = 0; i <= n - 2; i++) {
            int pos = Integer.parseInt(positions[i]);
            sum += pos;
            sentence[pos - 1] = words[i];
        }

        missingPos = n * (n + 1) / 2 - sum;
        sentence[missingPos - 1] = words[n - 1];

        for(String word : sentence) {
            result.append(word);
            result.append(' ');
        }

        System.out.println(result.toString().trim());
    }
}
