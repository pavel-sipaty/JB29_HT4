package by.jb29.mod1.les06.masMas;

import java.util.Random;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Task10 {

	public static void main(String[] args) {

		int k = 2;
		int p = 3;

		int[][] mas = new int[5][5];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("----------------");

		System.out.println("k-ая строка: ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[k][i] + "  ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("р-ый столбец: ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][p] + "  ");
		}
		// System.out.println();

	}
}
