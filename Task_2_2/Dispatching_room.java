import java.util.*;

public class Dispatching_room{
  private int area;
  private ArrayList<Dispatcher> dispatcher_list = new ArrayList<Dispatcher>();
  
  Dispatching_room(){
    System.out.println("Dispatching_room");
  }
  
  public int getArea() {
    return area;
  }
  
  public void setArea(int area) {
    this.area = area;
  }

  public ArrayList<Dispatcher> getDispatcher_list() {
    return dispatcher_list;
  }	
  
  public void setDispatcher_list(ArrayList<Dispatcher> dispatcher_list){
    this.dispatcher_list = dispatcher_list;
  }	  
 
}