package dynamique;
import java.util.ArrayList;

	 
	 public class matricedynamiqueinferieur
	 {ArrayList<ArrayList> tav1 = new ArrayList <>();
	 int n ;
	   public matricedynamiqueinferieur(int n)
	 { 
	 	
	   this.n=n;
	   int s =1;
	   for (int i=0;i<n;i++)
	     {   
	 	   ArrayList<Integer> tav2 = new ArrayList <>();
	        tav1.add(tav2);
	        for(int j=0;j<i;j++)
	      {  
	        	tav2.add(s);
	             s++; 
	      }
	    }
	 }
	   public String toString ()
       {
       	 for(int i=0;i<n;i++){
       		System.out.println(tav1.get(i));
       	 }
       	 return "";
       	 }
         
}



       
     
    

