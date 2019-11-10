package by.jb29.mod1.les06;

import java.util.Random;

/*Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти
числа.*/

public class Task06 {

	public static void main(String[] args) {

		int[] mas = new int[10];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(15);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}

		int min = mas[0];
		int max = 0;

		System.out.println();
		System.out.println("----------------------------");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}

		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		
		
		System.out.println("Наименьшая длина числовой оси равна " + (Math.abs(max-min)));

	}

}
