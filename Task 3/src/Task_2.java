
public class Task_2 extends Super_numbers {
	
	private int sum_first(int a, int b, int c) {
		
		return a+b+c;
	}
	
	
	Task_2(){
	  
	  setNumber(3);
	  setDigital_number();
	  
	  
	  System.out.println("     ");
	  System.out.println("������� 2.2");
	  System.out.print("��������� ����� 1: ");
	  System.out.println(getNumbers().get(0));
	  
	  System.out.print("��������� ����� 2: ");
	  System.out.println(getNumbers().get(1));
	  
	  System.out.print("��������� ����� 3: ");
	  System.out.println(getNumbers().get(2));
	  
	  System.out.print("����� ������ ����: ");
	  System.out.println(sum_first(getDigital_number(1,1),getDigital_number(2,1),getDigital_number(3,1)));
	  
	  
	  
	}

	
}
