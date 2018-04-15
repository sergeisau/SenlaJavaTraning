import java.util.*;

public class Main_class{
  public static void main(String args[]){
    Dispatching_room disp1 = new Dispatching_room();
	
	
	Dispatcher  d1 = new Dispatcher();
    Dispatcher d2 = new Dispatcher();
	
	
	Flight f1 = new Flight();
	Flight f2 = new Flight();
	Flight f3 = new Flight();
	
	Airplane a1 = new Airplane();
	
	f1.setId(1);
	f1.setDistance(1000);
	f1.setDispatcher(d1);
	f1.setAirplane(a1);
	
	f1.setId(2);
	f1.setDistance(2000);
	f1.setDispatcher(d1);
	f1.setAirplane(a1);
	
	f1.setId(3);
	f1.setDistance(3000);
	f1.setDispatcher(d2);
	f1.setAirplane(a1);
	
	
	
	ArrayList<Flight> f_list = new ArrayList<Flight>();
    f_list.add(f1);
    f_list.add(f2);	
	
	ArrayList<Flight> f_list2 = new ArrayList<Flight>();
    f_list2.add(f3);
   
	
	d1.setId(1);
	d1.setDispatcher_room(disp1);
	d1.setFlight_list(f_list);
	
	d2.setId(2);
	d2.setDispatcher_room(disp1);
	d2.setFlight_list(f_list2);
	
	ArrayList<Dispatcher> disp_list = new ArrayList<Dispatcher>();
    disp_list.add(d2);
	
	disp1.setArea(1000000);
	disp1.setDispatcher_list(disp_list);
	
	ArrayList<Flight> f_airplane_list = new ArrayList<Flight>();
    f_airplane_list.add(f1);
    f_airplane_list.add(f2);	
	f_airplane_list.add(f3);
	
	a1.setCompany("Рога и копыта");
	a1.setName("Airbus A 310");
	a1.setAge(5);
	a1.setFlight_list(f_airplane_list);
	
  }

}
