import java.util.Scanner;

public class Welcome5 {
	public static void main(String[] args) {
		System.out.println("Git initialization should be done on specific folders.");
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your name: ");
		String userName = input.nextLine();
		String message = "Welcome young blood. We learned that your name is " + userName + ". You are welcome again.";
		System.out.println(message);
	}
}
