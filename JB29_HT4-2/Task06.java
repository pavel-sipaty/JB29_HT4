package by.jb29.mod1.les06.masMas;

import java.util.Random;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше
последнего.*/

public class Task06 {

	public static void main(String[] args) {

		int[][] mas = new int[15][7];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "   ");
			}
			System.out.println();
		}

		System.out.println("----------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 1; j < mas[i].length; j += 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.print(mas[i][j] + "   ");
				}

			}
			System.out.println();
		}

	}

}
