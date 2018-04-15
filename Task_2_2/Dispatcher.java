import java.util.*;

public class Dispatcher extends Person {
  
  private int id;
  private Dispatching_room dispatcher_room;
  private ArrayList<Flight> flight_list = new ArrayList<Flight>();

  public int getId(){
  
    return id;
  }	  
   
   public void setId(int id){
   
   this.id = id;
   }
   
   public Dispatching_room getDispatcher_room(){
    return dispatcher_room;
   }
   
   public void setDispatcher_room(Dispatching_room dispatcher_room){
	   this.dispatcher_room = dispatcher_room;
  }
   
   public ArrayList<Flight> getFlight_list(){
     return flight_list;
   }
   
   public void setFlight_list(ArrayList<Flight> flight_list){
   
    this.flight_list = flight_list;
   }
   
   Dispatcher(){
	   System.out.println("Dispatcher");
	   
   }

   }