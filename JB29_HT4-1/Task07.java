package by.jb29.mod1.les06;

import java.util.Random;

/*���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ��� �� �����, ������� ������� Z,
���� ������. ���������� ���������� �����.*/

public class Task07 {

	public static void main(String[] args) {
		
		int[] mas = new int[10];
		int count = 0;
		int z = 12;

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(30);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "     ");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "     ");
		}
		
		System.out.println();
		System.out.println("���������� �����: " + count);

	}

}
