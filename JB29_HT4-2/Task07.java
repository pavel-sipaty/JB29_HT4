package by.jb29.mod1.les06.masMas;

//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task07 {

	public static void main(String[] args) {

		int sum = 0;
		
		int[][] mas = new int[][] { { 1, 5, -7, -6, -1 }, { 0, 1, 8, 4, -9 }, { 5, 8, 9, -4, -1 }, { 2, 6, 3, -5, 4 },
				{ 0, 0, 3, -5, 4 } };

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "   ");
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(mas[i][j] < 0 && mas[i][j] % 2 != 0) {
					sum = sum + Math.abs(mas[i][j]);
				}
			}
			
		}
		
		System.out.println("Сумма модулей отрицательных нечетных элементов равна " + sum);

	}

}
