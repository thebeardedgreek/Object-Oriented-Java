import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.out;

public class movieBookList {
    static ArrayList<String> movieBookList = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Boolean keepLooping = true;
        while (keepLooping) {
            out.print("Enter a movie or book title:\n");
            String userEntry = user.nextLine();
            movieBookList.add(userEntry);
            out.print("Would you like to enter another title? (Y or N)\n");
            String userChoice = user.nextLine().toLowerCase();
            if (userChoice.equals("n")) {
                keepLooping = false;
            }
        }
        Collections.sort(movieBookList);
        for (String entry : movieBookList){
            out.print(entry + "\n");
        }
    }
}
