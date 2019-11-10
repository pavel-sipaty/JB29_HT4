package by.jb29.mod1.les06.masMas;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {

	public static void main(String[] args) {
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

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i][i] + "  ");

			System.out.println();
		}

	}

}
