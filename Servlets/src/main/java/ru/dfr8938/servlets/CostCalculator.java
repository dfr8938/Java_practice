package ru.dfr8938.servlets;

public class CostCalculator {

	private double kmCost;
	private double kgCost;

	public CostCalculator(double kmCost, double kgCost) {

		this.kmCost = kmCost;
		this.kgCost = kgCost;
	}

	public double costCalc(double kg, int km) {

		return kg * kgCost + km * kmCost;
	}
}