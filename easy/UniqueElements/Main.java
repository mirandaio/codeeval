import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            uniqueElements(line);
        }
    }

    private static void uniqueElements(String line) {
        String[] nums = line.split(",");
        String prev = nums[0];
        System.out.print(prev);

        for(int i = 1; i < nums.length; i++) {
            if(!prev.equals(nums[i])) {
                prev = nums[i];
                System.out.print(",");
                System.out.print(prev);
            }
        }

        System.out.println();
    }
}
