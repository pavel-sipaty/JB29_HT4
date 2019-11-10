package by.jb29.mod1.les06;

import java.util.Random;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

public class Task10 {

	public static void main(String[] args) {

		int[] mas = new int[15];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "     ");
		}

		System.out.println();
		System.out.println("----------------------------");
		
		
		System.out.print("a[i] > i: ");
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] > i) {
				System.out.print(mas[i] + "   ");
			}
		}

	}

}