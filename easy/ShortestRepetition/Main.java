import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            shortestRepetition(line);
        }
    }

    private static void shortestRepetition(String str) {
        int len = str.length();
        int shortestLen = len;

        for(int partLen = 1; partLen <= len; partLen++) {
            if(len % partLen == 0) {
                String part = str.substring(0, partLen);
                boolean isPeriod = true;

                for(int j = partLen; j <= len - partLen; j += partLen) {
                    if(!str.substring(j, j + partLen).equals(part)) {
                        isPeriod = false;
                        break;
                    }
                }

                if(isPeriod) {
                    shortestLen = partLen;
                    break;
                }
            }
        }

        System.out.println(shortestLen);
    }
}
