package by.jb29.mod1.les06;

//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class Task02 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {2, 5, 0, 125, 0, 0, 0, 256, 354, 0};
		
		int count = 0;
		
		
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] == 0) {
				count++;
			}
			
		}
		
		
		int[] ar = new int[count];
		
		
		count = 0;
		
		for(int i = 0; i < mas.length; i++) {
			
			
				if(mas[i] == 0) {
					
					ar[count] = i;
					count++;
				}
			}
		
		for(count = 0; count < ar.length; count++) {
			
			System.out.print(ar[count] + ", ");
		}
			
				
		

	}

}
