package currencyC;

import java.util.Scanner;

public class Currency {
         Double inr,usd,yen,euro;
         Scanner sc=new Scanner(System.in);
         public void dollartoinr()
         {
        	 System.out.println("enter usd");
        	 usd=sc.nextDouble();
        	 inr=usd*81.83;
        	 System.out.println("inr="+inr);
        	 
        	 
         }
         public void eurotoinr()
         {
        	 System.out.println("enter euro");
        	 euro=sc.nextDouble();
        	 inr=euro*79.06;
        	 System.out.println("inr="+inr);
        	 
        	 
         }
         public void yentoinr()
         {
        	 System.out.println("enter yen");
        	 yen=sc.nextDouble();
        	 inr=yen*0.57;
        	 System.out.println("inr="+inr);
        	 
        	 
         }
         public void inrtousd()
         {
        	 System.out.println("enter inr to dollar");
        	 inr=sc.nextDouble();
        	 usd=inr/81.83;
        	 System.out.println("dollar="+usd);
        	 
        	 
         }
         public void inrtoeuro()
         {
        	 System.out.println("enter inr to euro");
        	 inr=sc.nextDouble();
        	 euro=inr/79.06;
        	 System.out.println("euro="+euro);
        	 
        	 
         }
         public void inrtoyen()
         {
        	 System.out.println("enter inr to yen");
        	 inr=sc.nextDouble();
        	 yen=inr/0.59;
        	 System.out.println("yen="+yen);
        	 
        	 
         }
}
