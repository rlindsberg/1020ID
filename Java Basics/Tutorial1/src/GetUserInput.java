import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //add a prompt
        System.out.println("Enter some text");

        //Wait for the user to enter text
        String line = input.nextLine();

        //Tell the user what was entered
        System.out.println("You entered: " + line);

    }
}
