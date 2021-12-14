package newprojet;

import java.util.Scanner;



public class Matrix1indice {
	public int [][]M;
	public int n ;
	public int dim;
	public Matrix1indice() {}
	public void create()
	{
		Scanner scann;	
	    scann = new Scanner(System.in);
	    
	    System.out.println("saisir le nombre d'element ");
		this.n = Integer.parseInt(scann.nextLine());
		System.out.println("saisir la dimension du matrice dense ");
		this.dim = Integer.parseInt(scann.nextLine());
		this.M = new int[n][2];
		for(int i=0; i<n ; i++) 
		{
				System.out.print("saisir l'indice ");
				M[i][0]=Integer.parseInt(scann.nextLine());
				System.out.print("saisir M[i][j]");
				M[i][1]=Integer.parseInt(scann.nextLine());
		}
		scann.close();
	}
	
	 public Matrix1indice(Matrix m1)
	    {   
	    	int k=0;
	    	int n1 = m1.n1;
	    	int n2 = m1.n2;
	    	
	    	int [][]m=m1.M;
	    	this.n = n2*n1+1;
	    	this.M=new int[n][2];
	    	for(int i=0;i<n1;i++)
	    	{
	    		for(int j=0;j<n2;j++)
	    		{
	    			if(m[i][j]!=0) {
	    				M[k][0]=j+i*n2;
	    				M[k][1]=m[i][j];
	    				k++;
	    			}
	    		}
	    	}
	    }
	    public Matrix1indice(Matrix2indice c1)
	    {
	    	int [][]c0 = c1.M;
	    	this.n=c1.n;
	    	int n1=c0.length;
	    	this.M=new int [n1][2];
	    	for(int i=0;i<n1;i++)
	    	{
	    		for(int j=0;j<3;j++)
	    		{
	    			if(c0[i][j]!=0) {
	    			 M[i][0]=c0[i][0]*c1.dim+c0[i][1];
	    			 M[i][1]=c0[i][2];
	    			}
	    		}
	    	}
	    	
	    }
	    public Matrix1indice(lineaire c1)
	    {   
	    	int k=0;
	    	int []tab = c1.tab;
	    	int n1=tab.length;
	    	this.n=c1.n;
	    	this.M=new int [n1][2];
	    	for(int i=0 ;i<n1;i++)
	    	{
	    		if(tab[i]!=0)
	    		{
	    			M[k][1]=tab[i];
	    			M[k][0]=i;
	    			k++;
	    			
	    		}
	    	}
	    }
	    public void trans()
		{
			int [][]mtransp = new int[n][2];
			for(int i=0;i<n;i++)
				for(int j=0;j<2;j++)
					mtransp[i][j]=M[i][j];
			this.M = new int[2][n];
			for(int i=0; i<2 ; i++) 
			{
				
				for(int j=0; j<n ; j++) 
				{
				M[i][j]=mtransp[j][i];
				}
			} 
			for(int i=0;i<2;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		{
	    			if(M[i][1]!=0)
	    			{
	    			System.out.print(M[i][j]+"\t");
	    			}
	    		}
	    		System.out.print("\n");
	    	}
		}
	    public String toString()
	    {
	    	for(int i=0;i<n;i++)
	    	{
	    		for(int j=0;j<2;j++)
	    		{
	    			if(M[1][j]!=0)
	    			{
	    			System.out.print(M[i][j]+"\t");
	    			}
	    		}
	    		System.out.print("\n");
	    	}
	    	System.out.print("\n");
	    	return "";
	    }
}
