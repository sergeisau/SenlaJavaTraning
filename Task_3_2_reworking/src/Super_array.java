import java.util.Random;
import java.util.ArrayList;

public class Super_array {

	private int generate()

	{
		Random rnd = new Random();
		return rnd.nextInt(100);
	}

	private ArrayList<Dight> array_dight = new ArrayList<Dight>();

	public ArrayList<Dight> getArray_dight() {

		return array_dight;
	}

	public void setArray_dight() {

		for (int i = 0; i < generate(); i++) {

			Dight buf_number = new Dight();
			buf_number.setInt_Str_number(generate());
			array_dight.add(buf_number);

		}
	}

}
