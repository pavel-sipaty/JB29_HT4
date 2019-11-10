package by.jb29.mod1.les06.masMas;

import java.util.Random;

/*Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди
элементов массива.
*/

public class Task08 {

	public static void main(String[] args) {

		int[][] mas = new int[5][7];
		int count = 0;

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
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					count++;
				}
			}
			
		}
		
		System.out.println("Цифра 7 встречается " + count + " раз.");

	}

}
