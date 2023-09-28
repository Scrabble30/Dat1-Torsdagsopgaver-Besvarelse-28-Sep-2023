import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please type your name: ");

		String name = scanner.nextLine();

		System.out.println("Welcome " + name);
		System.out.print("Please type your age: ");

		int age = scanner.nextInt();

		System.out.println("Your age is: " + age);

		int retirementAge = Math.max(0, 67 - age);

		System.out.println("You may retire after " + retirementAge + " years.");
	}
}