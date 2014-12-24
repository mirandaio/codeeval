import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            longestWord(line);
        }
    }

    private static void longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for(String word : words) {
            if(word.length() > longest.length())
                longest = word;
        }

        System.out.println(longest);
    }
}
