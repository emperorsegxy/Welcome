import java.util.Scanner;

public class Welcome4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int number1 = input.nextInt();
		System.out.print("Enter another integer: ");
		int number2 = input.nextInt();
		int sum = number1 + number2;
		System.out.printf("The sum of these numbers is %d.", sum);
		System.out.printf("\nThese were the numbers you input: %d, %d", number1, number2);
	}
}