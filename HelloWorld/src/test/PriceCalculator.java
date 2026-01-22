package test;

@FunctionalInterface
public interface PriceCalculator {

	double calculate(double basePrice, double taxRate);
}
