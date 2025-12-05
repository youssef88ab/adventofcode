import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayTwoPartOne {

    public static boolean isValid(String str)
    {
        if (str.charAt(0) == '0') {
            return false;
        }

        if (str.length() % 2 != 0) { return true; }

        int mid = str.length() / 2;
        String str1 = str.substring(0, mid);
        String str2 = str.substring(mid);

        return !(str1.equals(str2));
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/input.txt"));

        long result = 0L;

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            // Split by comma
            String[] ranges = line.split(",");

            for (String range : ranges) {
                if (range.isEmpty()) continue;

                // Split start and end
                String[] parts = range.split("-");
                long start = Long.parseLong(parts[0]);
                long end = Long.parseLong(parts[1]);

                for (long i = start ; i <= end ; i++) {
                    String str = String.valueOf(i);
                    if (!isValid(str)) { result += i; }
                }
            }
        }

        sc.close();

        // Now you can use start and end
        System.out.println(result);
    }

}