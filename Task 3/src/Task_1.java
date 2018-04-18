
public class Task_1 extends Super_numbers{

	private int max2(int d, int e) {
		
		int res = d > e ? d:e;
		
		return res;
	}
	
	private int max(int a, int b, int c) {
		
		return max2(max2(a,b),c);		
	}
    
	Task_1(){
		setNumber(1);
		setDigital_number();
		
		System.out.println("Задание 2.1");
		
		System.out.print("Случайное число: ");
		System.out.println(getNumbers().get(0));
		
		System.out.print("Наибольшая цифра: ");
		System.out.println(max(getDigital_number(1,1),getDigital_number(1,2),getDigital_number(1,3)));
		
		
	}

}
