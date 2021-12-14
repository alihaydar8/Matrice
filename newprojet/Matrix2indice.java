package newprojet;

import java.util.Scanner;


public class Matrix2indice {
	public int [][]M;
	public int n ;
	public int dim;
	public Matrix2indice() {}
	public void create()
	{
		Scanner scann;	
	    scann = new Scanner(System.in);
	    
	    System.out.println("saisir le nombre d'element ");
		this.n = Integer.parseInt(scann.nextLine());
		System.out.println("saisir la dimension du matrice dense ");
		this.dim = Integer.parseInt(scann.nextLine());
		this.M = new int[n][3];
		for(int i=0; i<n ; i++) 
		{
				System.out.print("saisir i ");
				M[i][0]=Integer.parseInt(scann.nextLine());
				System.out.print("saisir j ");
				M[i][1]=Integer.parseInt(scann.nextLine());
				System.out.print("saisir M[i][j]");
				M[i][2]=Integer.parseInt(scann.nextLine());
		}
		System.out.print("\n");
		scann.close();
	}
	
	
	
	
	
	
	public Matrix2indice(Matrix m1)
	{
		{   int k = 0;
		int n2=m1.n2;
		int n1=m1.n1;
		int [][]m =m1.M;
		this.n =n1*n2;
		this.M= new int [n+1][3];
	    for (int i=0;i<n1;i++)
	    {
	    	for(int j=0;j<n2;j++)
	    	{ if(m[i][j]!=0) {
	    		 M[k][0]=i;
	    		  M[k][1]=j;
	    		  M[k][2]=m[i][j];
	    			k++;
	    	}	
	    	}
	    }
	}
	}
	public Matrix2indice(Matrix1indice c1)
	{
		this.n=c1.n;
		int [][]c0 = c1.M;
		int n1 = c0.length;
		this.M=new int [n1][3];
		 for (int i=0;i<n1;i++)
		    {
		    	for(int j=0;j<2;j++)
		    	{ 
		    		if(c0[i][j]!=0) {
		    		M[i][0]= c0[i][0]/c1.dim;
		    		M[i][1]= c0[i][0]%c1.dim;
		    		M[i][2]=c0[i][1];
		    	     }
		      }
		    }
     } 
	 public Matrix2indice(lineaire c1)
	    {   
	    	int k=0;
	    	int []tab = c1.tab;
	    	int n1=tab.length;
	    	this.dim=c1.dim;
	    	this.M=new int [n1][3];
	    	for(int i=0 ;i<n1;i++)
	    	{
	    		if(tab[i]!=0)
	    		{
	    			M[k][2]=tab[i];
	    			M[k][1]=i%dim;
	    			M[k][0]=i/dim;
	    			k++;
	    			
	    		}
	    	}
	    }
	 public void trans()
		{
			int [][]mtransp = new int[n][3];
			for(int i=0;i<n;i++)
				for(int j=0;j<3;j++)
					mtransp[i][j]=M[i][j];
			this.M = new int[3][n];
			for(int i=0; i<3 ; i++) 
			{
				
				for(int j=0; j<n ; j++) 
				{
				M[i][j]=mtransp[j][i];
				}
			} 
			for(int i=0;i<3;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		{
	    			if(M[2][j]!=0)
	    			{
	    			System.out.print(M[i][j]+"\t");
	    			}
	    		}
	    		System.out.print("\n");
	    	}
		}

	
	
	
	
public String toString ()
	
	{
		for(int i=0; i<n ;i++)
	    {
		for(int j=0;j<3;j++)
	    if(M[i][2]!=0) {
	      System.out.print(M[i][j]+"\t");
	    	           }
	    System.out.print("\n");}
		System.out.print("\n");
	 return "";
	 }


}