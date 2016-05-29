class Convert {
	private float celsius;
	// °F = °C . 1,8 + 32
	private float fahrenheit;

	public Convert(float celsius, float fahrenheit) {
		super();
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}

	public float getCelsius() {
		return celsius;
	}

	public void setCelsius(float celsius) {
		this.celsius = celsius;
	}

	public float getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(float fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public Convert() {
		this(0, 0);
	}

	public void convertion() {
		celsius = 32;
		fahrenheit = (float) (celsius * (1.8) + 32);
		// fahrenheit = celsius * (2) + 32;
		System.out.println("Celsius of " + this.celsius + " is: " + this.fahrenheit + " Fahrenheit");
	}
}

public class Main {

	public static void main(String[] args) {
		Convert degrees = new Convert();
		degrees.convertion();
	}
}
