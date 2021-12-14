package cruse;

public class cruse1indice {
    int [][]c;
    int n;
    public cruse1indice(Matrice m1)
    {   
    	int k=0;
    	this.n = m1.n;
    	int [][]m=m1.matrice;
    	int n1 = n*n;
    	this.c=new int[n1][2];
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			if (m[i][j]!=0)
    			{
    				c[k][0]=j+i*n;
    				c[k][1]=m[i][j];
    				k++;
    			}
    		}
    	}
    }  
    public String toString()
    {
    	for(int i=0;c[i][1]!=0;i++)
    	{
    		for(int j=0;j<2;j++)
    		{
    			System.out.print(c[i][j]+"\t");
    		}
    		System.out.print("\n");
    	}
    	return "";
    }
    
}
