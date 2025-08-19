import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing the current song");
            System.out.println("Would you like to take this song off of request? If so, answer yes");
            String userInput = scanner.nextLine();

            if (userInput.contentEquals("yes"))
                isOnRepeat = false;
        }

        System.out.println("Playing next song");
    }
}