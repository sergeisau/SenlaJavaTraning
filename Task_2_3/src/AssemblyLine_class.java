
public class AssemblyLine_class implements IAssemblyLine {
	
   ILineStep  step = new LineStep_class(); 
   
public IProduct assemblyProduct(IProduct iproduct) {
	   System.out.println("Сборочная линия:");
	   System.out.println("---------------------");
       iproduct.installFirstPart(step.buildProductPart());
       iproduct.installSecondPart(step.buildProductPart());
	   iproduct.installThirdPart(step.buildProductPart());
	   System.out.println("Танк собран");
	return iproduct;
	}

}
