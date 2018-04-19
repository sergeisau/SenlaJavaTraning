
public class SumBouquet extends SuperBouquet {

	private int sumBouquet;

	SumBouquet() {
		setBouquet();
		System.out.println("Название   Цена букета");
		for (Flower flower : getBouquet()) {
			System.out.print(flower.getName());
			System.out.print(" ");
			System.out.println(flower.getPrice());
			sumBouquet += flower.getPrice();
		}
		System.out.println("-------------------------");
		System.out.print("Итого: ");
		System.out.print(sumBouquet);
	}

}
