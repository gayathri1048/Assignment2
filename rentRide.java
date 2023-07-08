import java.util.*;
public class rentRide{
    ArrayList<String> distance=new ArrayList<String>();
	String[] Driver1;
    String[] CarModel1;
	Double[] rating1;
	String[] distance1;
	ArrayList<String> Driver=new ArrayList<String>();
	ArrayList<String> CarModel=new ArrayList<String>();
	ArrayList<Double> rating=new ArrayList<Double>();
//	int i=0;
	Scanner sc=new Scanner(System.in);
	public void getInformation()
	{
        int i=0;
		while(i<5){
		Driver.add(sc.nextLine());
	    CarModel.add(sc.nextLine());
		rating.add(sc.nextDouble());
		sc.nextLine();
		distance.add(sc.nextLine());
        i++;
        }
		Driver1=Driver.toArray(new String[Driver.size()]);
		distance1=distance.toArray(new String[distance.size()]);
		CarModel1=CarModel.toArray(new String[CarModel.size()]);
		rating1=rating.toArray(new Double[rating.size()]);
		
		
	}
}