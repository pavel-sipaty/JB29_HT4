package by.jb29.mod1.les06;

// ���� ������������������ �������������� ����� �1 �2 ,..., �n . ��������, ����� �� ��� ������������.



public class Task04 {

	public static void main(String[] args) {
		
		int[] ar = new int[] {2, 2, 2, 2, 2, 2, 1};
		
		proverka(ar);
		

	}

/////////////////////////////////////
	
	public static void proverka(int[] mas) {
		
		boolean flag = true;
		
		for(int i = 1; i < mas.length; i++) {
			
			if(mas[i] < mas[i-1]) {
				
				flag = false;
				break;
				
			}
		}
			
		if(flag) {
			
			System.out.println("������������������ ������������.");
				
		}else {
			System.out.println("������������������ �� �������� ������������.");
		}
			
		
		
	}
	
	
	
}
