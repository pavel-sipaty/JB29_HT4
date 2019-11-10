package by.jb29.mod1.les06;



/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

public class Task08 {

	public static void main(String[] args) {
		
		double[] mas = new double[] {2, 2.5, 45.4, 111, -5};
		
		
		for(int i = 0; i<mas.length; i++) {
			
			System.out.print(mas[i] + "   ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		int neg = negativ(mas);
		int poz = pozitiv(mas);
		int zero = zero(mas);
		
		
		
		System.out.println("Количество отрицательных элементов: " + neg);
		System.out.println("Количество положительных элементов: " + poz);
		System.out.println("Количество нулевых элементов: " + zero);
		
		
	


	}
	
	
	public static int zero(double[] mas) {
		int count = 0;
		for (int i=0; i<= mas.length-1; i++) {
			if (mas[i]==0) {
				count++;
			}
		}
		
		return count;
	}

	public static int pozitiv(double[] mas) {
		int count = 0;
		for (int i=0; i<= mas.length-1; i++) {
			if (mas[i]>0) {
				count++;
			}
		}
		
		return count;
	}

	public static int negativ(double[] mas) {
		int count = 0;
		for (int i=0; i<= mas.length-1; i++) {
			if (mas[i]<0) {
				count++;
			}
		}
		
		return count;
	}

}
