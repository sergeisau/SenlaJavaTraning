import java.util.*;

public class Airplane{

  private String company;
  private String name;
  private int age;
  private ArrayList<Flight> flight_list = new ArrayList<Flight>();
  
  
  public ArrayList<Flight> getFlight_list(){
     return flight_list;
   }
   
   public void setFlight_list(ArrayList<Flight> flight_list){
   
    this.flight_list = flight_list;
   }
   
   public String getCompany(){
        
    return company;
   }
   
   public void setCompany(String company){
    
    this.company = company;	

  }
   
  public String getName(){
        
    return name;
   }
   
   public void setName(String name){
    
   this.name = name;	}
	
	
	public int getAge(){
		return age;
		
	}
	
	public void setAge(int age){
      this.age = age;
	
	}		
			

  }

