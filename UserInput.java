import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name: ");
        System.out.println("Hi " + keyboard.nextLine() + "!");
    }
}

