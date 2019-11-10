package by.jb29.mod1.les06;

/*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

public class Task09 {

	public static void main(String[] args) {

		double[] mas = new double[] { 12.5, 55.66, 1, 50, -5, 48, 12, 99.9, 99 };

		double min = 0;
		double max = 0;
		int minIndex = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "     ");
		}
		System.out.println();

		
		min = mas[0];

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxIndex = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				minIndex = i;
			}
		}
		
		double temp = max;
		mas[maxIndex] = min;
		mas[minIndex] = temp;

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "     ");
		}
	}
}