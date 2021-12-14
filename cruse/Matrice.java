package cruse;

public class Matrice {
	public int n;
	public int [][]matrice;
	
	public Matrice(int n)
	{
		this.n = n;
	    this.matrice= new int[n][n];
	} 
	
	public String toString ()
	{for(int i=0;i<n;i++)
	    {for(int j=0;j<n;j++)
	    System.out.print(matrice[i][j]+"\t");
	  System.out.print("\n");}
	 return "";}
	

public void matricesuperieur()
{
int c1=1;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i<j){
        	matrice [i][j]=c1;
            c1++;
		     }
      
        	}}}



public void matriceinferieur()
{
int c2=1;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i>j){ matrice[i][j]=c2;
            c2++;}
              }}}



public void matriceidentite()
{
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i==j)matrice[i][j]=i;
          }}}

}



    



	


