import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            lowestUniqueNumber(line);
        }
    }

    private static void lowestUniqueNumber(String line) {
        String[] parts = line.split(" ");
        int[] nums = new int[parts.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(parts[i]);

        for(int num : nums) {
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1); 
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min && map.get(nums[i]) == 1) {
                min = nums[i];
                index = i;
            }
        }

        System.out.println(index + 1);
    }
}
