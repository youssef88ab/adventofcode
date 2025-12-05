import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoPartTwo {

    public static boolean isValid(String str)
        {
            if (str.charAt(0) == '0') {
                return false;
            }

            return !(str + str).substring(1, (str + str).length() - 1).contains(str);
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

            System.out.println(result);
        }

    }