import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            majorityElement(line);
        }
    }

    private static void majorityElement(String line) {
        String[] nums = line.split(",");
        int half = nums.length / 2;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if(map.get(num) > half) {
                System.out.println(num);
                return;
            }
        }

        System.out.println("None");
    }
}
