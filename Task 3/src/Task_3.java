
public class Task_3 extends Super_numbers {

  Task_3(){
	  
	  setNumber(3);
	  
	  System.out.println("     ");
	  System.out.println("Задание 2.3");
	  
	  System.out.print("Случайное число 1: ");
	  System.out.println(getNumbers().get(0));
	  
	  System.out.print("Случайное число 2: ");
	  System.out.println(getNumbers().get(1));
	  
	  System.out.print("Случайное число 3: ");
	  System.out.println(getNumbers().get(2));
	  
	  System.out.print("Разница между числом получившимся методом последовательной записи 1 и 2 числа и третьим числом: ");
	  int res = (getNumbers().get(0)*1000 + getNumbers().get(1)) - getNumbers().get(2);
	  System.out.println(res);
	  
	 
  }
}
