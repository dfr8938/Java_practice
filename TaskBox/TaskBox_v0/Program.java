import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double rateKm = 30;
		double rateWeight = 500;


		Scanner scanner = new Scanner(System.in);

		System.out.print("Weight: ");
		double weight = scanner.nextDouble();

		System.out.print("Kilometers: ");
		int km = scanner.nextInt();

		double cost = rateKm * km + rateWeight * weight;
		
		System.out.println(cost);

	}
}