package by.jb29.mod1.les06.masMas;

/*Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица,
и вывести на экран*/

public class Task01 {

	public static void main(String[] args) {
		
		int[][] mas = new int[3][4];
		
		mas[0][0] = 1;
		mas[0][1] = 0;
		mas[0][2] = 0;
		mas[0][3] = 0;
		mas[1][0] = 0;
		mas[1][1] = 1;
		mas[1][2] = 0;
		mas[1][3] = 0;
		mas[2][0] = 0;
		mas[2][1] = 0;
		mas[2][2] = 1;
		mas[2][3] = 0;
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "   ");
			}
			System.out.println();
		}

	}

}
