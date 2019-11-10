package by.jb29.mod1.les06;

public class Task03 {

	public static void main(String[] args) {
		
		int[] ar1 = new int[] {0, 2, 45, 158, 0, -5, 0};
		int[] ar2 = new int[] {2, 2, 45, 158, 0, -5, 0};
		int[] ar3 = new int[] {-4, 2, 45, 158, 0, -5, 0};
		int[] ar4 = new int[] {5, 2, 45, 158, 0, -5, 0};
		int[] ar5 = new int[] {0, -5, 45, 158, 0, -5, 0};
		
		proverka(ar1);
		proverka(ar2);
		proverka(ar3);
		proverka(ar4);
		proverka(ar5);
		

	}
	
////////////////////////////////////////////////////////////////////
	
	public static void proverka(int[] mas) {
		
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] > 0) {
				
				System.out.println("–аньше встречаетс€ положительное число - " + mas[i]);
				break;
				
			}else if(mas[i] < 0){
				
				System.out.println("–аньше встречаетс€ отрицательное число - " + mas[i]);
				break;
			}
			
			
		}
		
	}

}
