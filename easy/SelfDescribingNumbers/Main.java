import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            selfDescribing(line);
        }
    }

    private static void selfDescribing(String str) {
        HashSet<Long> set = new HashSet<Long>();
        set.add(1210L);
        set.add(2020L);
        set.add(21200L);
        set.add(3211000L);
        set.add(42101000L);
        set.add(521001000L);
        set.add(6210001000L);

        if(set.contains(Long.parseLong(str)))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
