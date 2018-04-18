
import java.util.ArrayList;
import java.util.Random;


public class Super_numbers {
    
	// список чисел
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	// список цифр
	private ArrayList<int[]> digital_number = new ArrayList<int[]>();
	
	//генерация чисел(параметр - количество чисел)
	public void setNumber(int count) {
		
		int buf_number;
		Random rnd = new Random();
		
		for(int i=0; i<count; i++) {
		  
		  buf_number = rnd.nextInt(899)+100;
		  numbers.add(buf_number);
		  }
			
		}
		
	
	public ArrayList<Integer> getNumbers() {
		
			
			return numbers; 
		
		
	}
	
	//разбивает числа на цифры
	public void setDigital_number() {
		
		
		for(int i = 0; i < numbers.size(); i++) {
			
			int[] buf_digital_number = new int[3];
			int numbers_buf = numbers.get(i);
			
			for(int j = 2; j >= 0; j--) {
				
				buf_digital_number[j] = numbers_buf % 10;
				numbers_buf /= 10;
				
			}
			
			digital_number.add(buf_digital_number);
			
					
		}
	
	}
	
	// Выводит ( номер числа, номер цифры). нумерация от 1;
	public int getDigital_number(int num_numbers, int num_dight) {
		
		return digital_number.get(num_numbers-1)[num_dight-1];
	}
	
	
	
}
