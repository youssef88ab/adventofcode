import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayThreePartOne {
    public static void main(String[] args) throws FileNotFoundException {

        // Variables
        List<String> list = new ArrayList<>();
        int result = 0;

        // Read Inputs
        Scanner sc = new Scanner(new File("src/input.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) list.add(line);
        }

        String[] arr = list.toArray(new String[0]);


        for (String s : arr) {
            int max = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int value = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                if (value > max) max = value;
            }
            result += max;
        }


        System.out.println(result);
    }
}