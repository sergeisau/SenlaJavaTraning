
public class Product_class implements IProduct {
  


@Override
public void installFirstPart(IProductPart iproductpart) {
	// TODO Auto-generated method stub
	System.out.println("Башня установлена");
}

@Override
public void installSecondPart(IProductPart iproductpart) {
	// TODO Auto-generated method stub
	System.out.println("Корпус  установлен");
}

@Override
public void installThirdPart(IProductPart iproductctpart) {
	// TODO Auto-generated method stub
	System.out.println("Двигатель установлен");
}
  
  
}
