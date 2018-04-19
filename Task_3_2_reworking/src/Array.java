import java.util.ArrayList;

public class Array extends Super_array {

	private ArrayList<String> array_str_dight = new ArrayList<String>();
	private String result_sum_string;

	Array() {
		setArray_dight();
		int sum = 0;

		System.out.println("Программа, позволяющая получить массив чисел в строках и вернуть строку сумму этих чисел!");
		System.out.println("Числа:");

		for (int i = 0; i < getArray_dight().size(); i++) {

			System.out.println(getArray_dight().get(i).getStr_number());

			array_str_dight.add(getArray_dight().get(i).getStr_number());

			sum += getArray_dight().get(i).getInt_number();
		}

		result_sum_string = Integer.toString(sum);

		System.out.print("Сумма : ");
		System.out.println(result_sum_string);

	}

}
