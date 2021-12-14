package newprojet;

import java.util.Scanner;

public class lineaire {
	 public int []tab;
	  public   int n;
	  public int dim;
	  public lineaire() {}
	     public void create()
	 	{
	    	 int i;
	 		Scanner scann;	
	 	    scann = new Scanner(System.in);
	 	    
	 	    System.out.println("saisir le nombre de element ");
	 		this.n = Integer.parseInt(scann.nextLine());
	 		System.out.println("saisir la dimension du matrice dense ");
			this.dim = Integer.parseInt(scann.nextLine());
	 		this.tab = new int[100];
	 		for(int k=0 ;k<100; k++)
	 		{
	 			tab[k]=0;
	 		}
	 		for(int j=0; j<n ; j++) 
	 		{
	 				System.out.print("saisir l indice ");
	 				i=Integer.parseInt(scann.nextLine());
	 				System.out.print("saisir la donne de cette indice ");
	 				tab[i]=Integer.parseInt(scann.nextLine());	
	 		}
	 		System.out.print("\n");
	 		scann.close();
	 	}
	     public lineaire(Matrix m1)
	     {   
	    	 int n1 =m1.n1;
	    	 int n2=m1.n2;
	    	 
	    	 int [][]m=m1.M;
	    	 int n = n1*n2;
	    	 this.tab=new int [n];
	    	 for(int i=0;i<n1;i++)
	    	 {
	    		 for(int j=0;j<n2;j++)
	    		 {
	    			 if(m[i][j]!=0)
	    			 {
	    				 tab[j+i*n2]=m[i][j];
	    			 }
	    		 }
	    	 }
	     }
	     public lineaire(Matrix1indice c1)
	     {
	    	 int max = 0;
	    	 int[][]c=c1.M;
	    	 int n1 = c.length;
	    	 for(int i=0;i<n1;i++)
	    	 {
	    		 if(c[i][0]>max)
	    		 {
	    			 max = c[i][0];
	    		 }
	    	 }
	    	 this.tab=new int [max+2];
	    	 for(int i=0;i<=max;i++)
	    	 {
	    		 tab[i]=0;
	    	 }
	    	 
	    	 for(int i=0;i<n1;i++)
	    	 {
	    			 tab[c[i][0]]=c[i][1]; 
	     	 }
	     }
	     public lineaire(Matrix2indice c1)
	     {
	    	 int max = 0;
	    	 int[][]c=c1.M;
	    	 this.dim = c1.dim;
	    	 int n1 = c.length;
	    	 for(int i=0;i<n1;i++)
	    	 {
	    		 if(c[i][0]*dim+c[i][1]>max)
	    		 {
	    			 max = c[i][0]*dim+c[i][1];
	    		 }
	    	 }
	    	 this.tab=new int [max+2];
	    	 for(int i=0;i<=max;i++)
	    	 {
	    		 tab[i]=0;
	    	 }
	    	 for(int i=0;i<n1;i++)
	    	 {
	    			 tab[c[i][0]*dim+c[i][1]]=c[i][2];
	    	 }
	    	 
	     }
	     
	     public String toString()
	     {
	    	 int k=1;
	    	 for(int i=1;tab[tab.length-i]==0;i++)
	    	 {
	    		 k++;
	    	 }
	    	 for(int i=0;i<tab.length-k;i++)
	    	 {
	    		 System.out.print(tab[i]+",");
	    	 }
	    	 System.out.print(tab[tab.length-k]+"\n");
	    	 System.out.print("\n");
	    	 return "";
	     }
	}



