public class Program {

	public static void main(String[] args) {

		Table smallTable = new Table(3, 7);
		Table middleTable = new Table(5, 10);
		Table bigTable = new Table(10, 20);

		CostCalculator costCalculator = new CostCalculator(30, 500);

		double costSmallTable = costCalculator.costCalc(smallTable, 20);
		double costMiddleTable = costCalculator.costCalc(middleTable, 20);
		double costBigTable  = costCalculator.costCalc(bigTable, 20);

		System.out.println("Cost small table:  " + costSmallTable);
		System.out.println("Cost middle table: " + costMiddleTable);
		System.out.println("Cost big table:    " + costBigTable);

	}
}