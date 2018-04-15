public class Flight{
  private int id;
  private int distance;
  private Dispatcher dispatcher;
  private Airplane airplane;
  
  
  public int getId(){
    return id;
  
  }
  
  public void setId(int id){
    this.id = id;
  }

    public int getDistance(){
    return distance;
  
  }
  
  public void setDistance(int distance){
    this.distance = distance;
  }

  public Dispatcher getDispatcher(){
	  
	  return dispatcher;
  }

  public void setDispatcher(Dispatcher dispatcher){
	  this.dispatcher = dispatcher;
  }

  public Airplane getAirplane(){
	  
	  return airplane;
  }

  public void setAirplane(Airplane airplane){
	  this.airplane = airplane;
  }
  
  Flight(){
    System.out.println("Flight");
  }
  
  
  
}