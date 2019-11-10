package by.jb29.mod1.les06.masMas;

import java.util.Random;

//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task05 {

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
		
		for (int i = 2; i < mas.length; i += 2 ) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "   ");
			}
			System.out.println();
		}

	}

}
