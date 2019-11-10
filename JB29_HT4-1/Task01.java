package by.jb29.mod1.les06;

import java.util.Random;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.




public class Task01 {

	public static void main(String[] args) {
		
		int n;
		int k;
		
		n = 10;
		k = 4;
		
		int[] a = new int[n];
		
		
		Random rand = new Random();
		int sum;
		sum = 0;
		
		System.out.print("Массив: ");
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = rand.nextInt(1000);
						
		}
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + ", ");
						
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		for(int i = 0; i <a.length; i++) {
		
			if(a[i] % k == 0) {
			
			sum = sum + a[i];
			System.out.println("Число " + a[i] + " кратно " + k);
			
			}else {
			
			System.out.println("Число " + a[i] + " некратно " + k);
			}
		}
		
		
		
		System.out.println("---------------");
		System.out.println("Сумма кратных " + k + " элементов равна " + sum);
		
		
		
	}
		
}
