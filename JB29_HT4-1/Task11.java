package by.jb29.mod1.les06;

import java.util.Random;
import java.util.Scanner;

/*���� ����������� ����� �1 ,�2 ,..., �n . ������� �� �� ���, � ������� ������� �� ������� �� � ����� L (0 < L
< �-1).*/

public class Task11 {

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
		
		System.out.println("������� ����� � >>");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("M = " + m);
		
		System.out.println("������� ����� L (0 < L < M-1");
		int l = sc.nextInt();
		if(l > 0 & l < m - 1) {
			System.out.println("L = " + l);
		}else {
			System.out.println("�������� ����� ����� L.");
		}
		
		System.out.println("----------------------------");
		System.out.println("�����, � ������� ������� �� ������� �� " + m + " ����� " + l + ":");
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] % m == l) {
				System.out.print(mas[i] + "   ");
			}
		}
		
		
		
		
		

	}

}
