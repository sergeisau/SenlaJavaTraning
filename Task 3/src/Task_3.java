
public class Task_3 extends Super_numbers {

  Task_3(){
	  
	  setNumber(3);
	  
	  System.out.println("     ");
	  System.out.println("������� 2.3");
	  
	  System.out.print("��������� ����� 1: ");
	  System.out.println(getNumbers().get(0));
	  
	  System.out.print("��������� ����� 2: ");
	  System.out.println(getNumbers().get(1));
	  
	  System.out.print("��������� ����� 3: ");
	  System.out.println(getNumbers().get(2));
	  
	  System.out.print("������� ����� ������ ������������ ������� ���������������� ������ 1 � 2 ����� � ������� ������: ");
	  int res = (getNumbers().get(0)*1000 + getNumbers().get(1)) - getNumbers().get(2);
	  System.out.println(res);
	  
	 
  }
}
