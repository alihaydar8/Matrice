package cruse;

 public class cruse2indice {
	int [][]c;
    int n;
	
	public cruse2indice(Matrice m1)
	{   int k = 0;
		this.n =m1.n;
		int [][]m =m1.matrice;
		int n1 =n*n;
		this.c= new int [n1][3] ;
	    for (int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if ( m[i][j] != 0  )
	    		{ c[k][0]=i;
	    		  c[k][1]=j;
	    		  c[k][2]=m[i][j];
	    			k++;
	    		}
	    	}
	    }
	}
	public String toString ()
	
	{
		for(int i=0;c[i][2] != 0 ;i++)
	    {for(int j=0;j<3;j++)
	    System.out.print(c[i][j]+"\t");
	  System.out.print("\n");}
	 return "";}

}
