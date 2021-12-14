package cruse;

public class cruselinealiser {
     int []tab;
     int n;
     public cruselinealiser(Matrice m1)
     {   
    	 this.n =m1.n;
    	 int [][]m=m1.matrice;
    	 int n1 = n*n;
    	 this.tab=new int [n1];
    	 for(int i=0;i<n;i++)
    	 {
    		 for(int j=0;j<n;j++)
    		 {
    			 if(m[i][j]!=0)
    			 {
    				 tab[j+i*n]=m[i][j];
    			 }
    		 }
    	 }
     }
  
     public String toString()
     {
    	 for(int i=0;i<tab.length-1;i++)
    	 {
    		 System.out.print(tab[i]+",");
    	 }
    	 System.out.print(tab[tab.length-1]+"\n");
    	 return "";
     }
}
