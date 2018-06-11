import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.out;
import java.io.File;

public class hashmapPractice {

    static int userInteger;
    static String userValue;
    static HashMap<Integer, String> myMap = new HashMap<Integer, String>();
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/GBTC441020ur/IdeaProjects/hashMapPracticeFile.txt");
        Scanner scannerFile = new Scanner(file);//note that Scanner can read from a file!
        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine();
            System.out.println(line);
        }
        Scanner scannerInput = new Scanner(System.in);
        userInteger = 0;
        myMap.put(10,"ten");
        myMap.put(11,"eleven");
        myMap.put(12,"twelve");

        Boolean keepLooping = true;
        while (keepLooping) {
            out.print("Enter a number in integer form:\n");

            int userEntry = scannerInput.nextInt();
            String value = myMap.get(userEntry);
            if (value == null){
                out.print("This number is not in the program; to add it, please type in the number as an integer:\n");
                userInteger = scannerInput.nextInt();
                out.print("Now, type the number as a word:\n");
                userValue = scannerInput.next();
            } else {
                out.print(value + "\n");
            }

            myMap.put(userInteger, userValue);
            out.print("Would you like to enter another number? (Y or N)\n");
            String userChoice = scannerInput.next().toLowerCase();
            if (userChoice.equals("n")) {
                keepLooping = false;
            }
        }
    }
}
