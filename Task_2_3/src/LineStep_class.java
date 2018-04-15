
public class LineStep_class implements ILineStep {
	public static int count = 0;
	
	IProductPart body = new ProductPart_class();
	IProductPart engine = new ProductPart_class();
	IProductPart tower = new ProductPart_class();
	
	
	
	
	public IProductPart buildProductPart() {
	  	
		IProductPart result = new ProductPart_class();
		
		switch (count%3) {	  	
	  	case 1:
		  System.out.println("Корпус"  +" доставлен " );
		  count++;
		  result = body;
		  break;
	  	case 2:
	  		System.out.println("Двигатель"  +" доставлен " );
			count++;
			result = engine;
	  		break;	
	  	case 0:
	  		System.out.println("Башня"  +" доставлена " );
	  		count++;
	  		result = tower;
	  		break;
	  	}
		return result;
	  	}
	  
  }

