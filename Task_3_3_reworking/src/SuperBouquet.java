import java.util.ArrayList;
import java.util.Random;

public class SuperBouquet {

	private ArrayList<Flower> bouquet = new ArrayList<Flower>();

	private Flower generateFlower() {

		Flower bufFlower = new Flower();
		Random rnd = new Random();
		int buf = rnd.nextInt(5);

		switch (buf) {
		case 0:
			bufFlower.setName("Роза");
			bufFlower.setPrice(500);
			break;
		case 1:
			bufFlower.setName("Гвоздика");
			bufFlower.setPrice(200);
			break;
		case 2:
			bufFlower.setName("Гербера");
			bufFlower.setPrice(300);
			break;
		case 3:
			bufFlower.setName("Тюльпан");
			bufFlower.setPrice(150);
			break;
		case 4:
			bufFlower.setName("Лилия");
			bufFlower.setPrice(100);
			break;

		}

		return bufFlower;
	}
	
	public void setBouquet() {
		
		int counter;
		Random rnd = new Random();
		
		counter = rnd.nextInt(30)+3;
		
		for(int i = 0; i < counter; i++) {
			bouquet.add(generateFlower());
		}
		
	}
	
	public ArrayList<Flower> getBouquet(){
		return bouquet;
	}
}
