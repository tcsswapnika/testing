package testing;

public class Calculator {
	public int add(int d, int e) {
		return d + e;
	}

	public float add(float a, float b) {
		if (a > 2) {
			System.out.println("Some message");
		}
		return a + b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

}
