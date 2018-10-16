package java8.reference.ex3;

public class Calcul {

	public double exec(double a, double b, Operation op) {
		return op.apply(a, b);
	}
}
