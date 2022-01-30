package checkForEven;

public class NumbersClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumbersCount eCount = new EvenNumbersCount();
		int[] number = { 45, 6, 40, 85, 21, 60 };
		EvenNumbersCount evenNumbersCount = new EvenNumbersCount(number);
		evenNumbersCount.checkEven(evenNumbersCount.numbers);
	}

}
