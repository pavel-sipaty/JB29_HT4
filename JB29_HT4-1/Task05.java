package by.jb29.mod1.les06;

import java.util.Random;

/*ƒана последовательность натуральных чисел а1 , а2 ,..., ап. —оздать массив из четных чисел этой
последовательности. ≈сли таких чисел нет, то вывести сообщение об этом факте.*/

public class Task05 {

	public static void main(String[] args) {

		int[] mas = new int[10];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}

		System.out.println();
		System.out.println("----------------------------");

		int count = 0;
		int index = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("„етных чисел в последовательности нет.");
		}

		System.out.println("count=" + count);
		System.out.println();

		int[] mas2 = new int[count];

		for (int i = 0; i < mas2.length; i++) {

			if (mas[i] % 2 == 0) {
				mas2[index] = mas[i];

				index++;
			}
		}

		System.out.println("index=" + index);

		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + ", ");
		}

	}

}