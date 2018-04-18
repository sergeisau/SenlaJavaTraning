
public class Task_4 extends Super_numbers{
	
	private int sum_dights(int a, int b, int c) {
		
		return a+b+c;
	}
	
	Task_4(){
		
		setNumber(1);
		setDigital_number();
		
		System.out.println("     ");
		System.out.println("Задание 2.4");
		
		System.out.print("Случайное число: ");
		System.out.println(getNumbers().get(0));
		
		System.out.print("Сумма цифр: ");
		System.out.println(sum_dights(getDigital_number(1,1),getDigital_number(1,2),getDigital_number(1,3)));
		
	}

}
