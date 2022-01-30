package checkForEven;

public class EvenNumbersCount {
	int[] numbers;

	public EvenNumbersCount() {
		// TODO Auto-generated constructor stub
		System.out.println("Program to see the number of even numbers");
	}

	public EvenNumbersCount(int[] numbers) {
		this.numbers = numbers;
	}

	void checkEven(int[] number) {
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("The number of even numbers are: " + count);
	}

}
