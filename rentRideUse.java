import java.util.Scanner;

public class rentRideUse extends rentRide {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		rentRideUse m=new rentRideUse();
		String s;
		int n,j=0;
		int mindis,min,in,flag=0;
      	double cusdistance;
     	String carrequested;
         Scanner scan=new Scanner(System.in);
         System.out.println("Customer Ride Distance: ");
         cusdistance=scan.nextDouble();
         scan.nextLine();
         System.out.println("Car Requested: ");
         carrequested=scan.nextLine();
         System.out.println("List of Drivers with Details: ");
         m.getInformation();
         n=m.distance1.length;
         int[] distances=new int[m.distance1.length];
         int[] index=new int[5];
         for(int i=0;i<m.distance1.length;i++)
         {
             s=m.distance1[i].substring(m.distance1[i].length()-2);
             if(s.equals("km"))
             {
                 distances[i]=Integer.valueOf(m.distance1[i].substring(0,m.distance1[i].length()-2))*1000;
             }
             else
             {
                 distances[i]=Integer.valueOf(m.distance1[i].substring(0,m.distance1[i].length()-1));
             }
         }
         for(int i=0;i<=m.CarModel1.length-1;i++)
         {
             if(m.CarModel1[i].equals(carrequested))
             {
                 flag=1;
                 if(m.rating1[i]>=4)
                 {
                     index[j]=i;
                     j++;
                 }
             }
         }
         if(flag==1) {
             min=distances[index[0]];
        in=index[0];
        for(int k=1;k<j;k++)
        {
        	if(min>distances[index[k]])
        	{
        		min=distances[index[k]];
        		in=index[k];
        	}
        }
        System.out.println("Driver "+m.Driver1[in]+" will get you to the destination.");
        System.out.println("Your charge will be RS"+(cusdistance*8)+"("+cusdistance+"*"+8+")");
        scan.close();
		}
		else
		{
			System.out.println("select some other car");
		}
	}
}
