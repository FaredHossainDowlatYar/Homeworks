package futuretuition;
import java.util.Scanner;

public class FutureTuition {

    public static void main(String[] args) {

        int currentTuition = 10000;
        int year = 0;
        while (true) {
            if (currentTuition > 20000) {
                System.out.println("The tuition amount after " + year + " year will become doouble");
                break;

            }
            currentTuition = currentTuition + 700;
            year = year + 1;
        }

    }
}
