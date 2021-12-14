package newprojet;

import java.util.Scanner;

public class Matrix {
	public int M[][];
	public int n1,n2;
	public Matrix() {}
	/*public Matrix(lineaire c1){
		int k=0;
		this.n2=c1.dim;
		this.n1=(c1.tab.length/c1.dim)+1;
		this.M=new int [n1][n2];
		for(int i=0;i<n1;i++)
			for(int j=0;j<n2;j++)
				{M[i][j]=0;
				M[i][j]=c1.tab[k];
				k++;
				}
	}
	*/
	public void create()
	{    
		Scanner scann;
	    scann = new Scanner(System.in);
		
		System.out.println("saisir le nombre de ligne ");
		this.n1 = Integer.parseInt(scann.nextLine());
		
		System.out.println("saisir le nmbre de colone");
		this.n2 = Integer.parseInt(scann.nextLine());
		
		this.M = new int[n1][n2];
 
		for(int i=0; i<n1 ; i++) 
		{
			
			for(int j=0; j<n2 ; j++) 
			{
				
				System.out.print("saisir M["+i+"]["+j+"]");
				M[i][j] =Integer.parseInt(scann.nextLine());
			}
		}
		scann.close();
		System.out.print("\n");
	  }
	
	
	public void addition()
	{
		Scanner scann;
	    scann = new Scanner(System.in);
		
		System.out.println("saisir le nombre de ligne du Matrice 1 ");
		int n11 = Integer.parseInt(scann.nextLine());
		
		System.out.println("saisir le nmbre de colone du Matrice 1");
		int n12 = Integer.parseInt(scann.nextLine());
		
		int [][]mad1 = new int[n11][n12];
 
		for(int i=0; i<n11 ; i++) 
		{
			
			for(int j=0; j<n12 ; j++) 
			{
				
				System.out.print("saisir M1["+i+"]["+j+"]");
				mad1[i][j] =Integer.parseInt(scann.nextLine());
			}
		}
		
		System.out.println("saisir le nombre de ligne du Matrice 2 ");
		int n21 = Integer.parseInt(scann.nextLine());
		
		System.out.println("saisir le nmbre de colone du Matrice 2");
		int n22 = Integer.parseInt(scann.nextLine());
		
		int [][]mad2 = new int[n21][n22];
 
		for(int i=0; i<n21 ; i++) 
		{
			
			for(int j=0; j<n22 ; j++) 
			{
				
				System.out.print("saisir M2["+i+"]["+j+"]");
				mad2[i][j] =Integer.parseInt(scann.nextLine());
			}
		}
		scann.close();
		System.out.print("\n");
		this.n1=n11;
		this.n2=n12;
		this.M = new int[n1][n2];
		System.out.print("Maatrice1\n");
		for(int i=0;i<n11;i++)
	    {for(int j=0;j<n12;j++)
	    System.out.print(mad1[i][j]+"\t");
	  System.out.print("\n");}
	System.out.print("\n");
	System.out.print("Maatrice2\n");
		for(int i=0;i<n21;i++)
	    {for(int j=0;j<n22;j++)
	    System.out.print(mad2[i][j]+"\t");
	  System.out.print("\n");}
	System.out.print("\n");
	
		if (n12==n22 && n11==n21)
		{	 
			for(int i=0; i<n1 ; i++) 
			{
				
				for(int j=0; j<n2 ; j++) 
				{
				M[i][j]=mad1[i][j]+mad2[i][j];
				}
			}
		}
		else {
			for(int i=0; i<n1 ; i++) 
			{
				
				for(int j=0; j<n2 ; j++) 
				{
				M[i][j]=0;
				}
			}
			System.out.print("      addition imposible\n     ");	
		}
		
	}
	public void mult()
	{
		Scanner scann;
	    scann = new Scanner(System.in);
		
		System.out.println("saisir le nombre de ligne du Matrice 1 ");
		int n11 = Integer.parseInt(scann.nextLine());
		
		System.out.println("saisir le nmbre de colone du Matrice 1");
		int n12 = Integer.parseInt(scann.nextLine());
		
		int [][]mad1 = new int[n11][n12];
 
		for(int i=0; i<n11 ; i++) 
		{
			
			for(int j=0; j<n12 ; j++) 
			{
				
				System.out.print("saisir M1["+i+"]["+j+"]");
				mad1[i][j] =Integer.parseInt(scann.nextLine());
			}
		}
		
		System.out.println("saisir le nombre de ligne du Matrice 2 ");
		int n21 = Integer.parseInt(scann.nextLine());
		
		System.out.println("saisir le nmbre de colone du Matrice 2");
		int n22 = Integer.parseInt(scann.nextLine());
		
		int [][]mad2 = new int[n21][n22];
 
		for(int i=0; i<n21 ; i++) 
		{
			
			for(int j=0; j<n22 ; j++) 
			{
				
				System.out.print("saisir M2["+i+"]["+j+"]");
				mad2[i][j] =Integer.parseInt(scann.nextLine());
			}
		}
		scann.close();
		System.out.print("\n");
		this.n1=n11;
		this.n2=n22;
		this.M = new int[n1][n2];
		System.out.print("Maatrice1\n");
		for(int i=0;i<n11;i++)
	    {for(int j=0;j<n12;j++)
	    System.out.print(mad1[i][j]+"\t");
	  System.out.print("\n");}
	System.out.print("\n");
	System.out.print("Maatrice2\n");
		for(int i=0;i<n21;i++)
	    {for(int j=0;j<n22;j++)
	    System.out.print(mad2[i][j]+"\t");
	  System.out.print("\n");}
	System.out.print("\n");
		if (n12==n21)
		{ 
			for(int i=0; i<n1 ; i++) 
			{
				
				for(int j=0; j<n2 ; j++) 
				{
					M[i][j]=0;
					for(int k=0;k<n2;k++)
					{
				        M[i][j]+=mad1[i][k]*mad2[k][j];
					}
				}
			}
		}
		else {
			for(int i=0; i<n1 ; i++) 
			{
				
				for(int j=0; j<n2 ; j++) 
				{
				M[i][j]=0;
				}
			}
			System.out.print("      multiplication imposible\n     ");
		}
	
	}
		
	public void trans(Matrix transp)
	{
		this.n1=transp.n2;
		this.n2=transp.n1;
		int [][]mtransp =transp.M;
		this.M = new int[n1][n2];
		for(int i=0; i<n1 ; i++) 
		{
			
			for(int j=0; j<n2 ; j++) 
			{
			M[i][j]=mtransp[j][i];
			}
		} 
	}
	
	
	public String toString ()
	{for(int i=0;i<n1;i++)
	    {for(int j=0;j<n2;j++)
	    System.out.print(M[i][j]+"\t");
	  System.out.print("\n");}
	System.out.print("\n");
	 return "";}
}
