import java.util.Scanner;

public class TaxProgram {
    public static void main(String arg[]) {

        /*
Small Tax Program - Instructions

1. You need to store the users income, tax and newIncome
2. Ask user for their taxable income
3. Accept user input
4. Store the user's input
5. Calculate tax only
6. Calculate income are tax (new income)
7. Print the new income

 */

        double income, tax, newIncome;

        System.out.println("Please enter your taxable income: ");
        Scanner userInput = new Scanner(System.in);
        income = userInput.nextDouble();
        tax = income * 0.13;
        newIncome = income * tax;

        System.out.println("Income (before tax) " + income);
        System.out.println("Income (after tax) " + newIncome);


    }
}

