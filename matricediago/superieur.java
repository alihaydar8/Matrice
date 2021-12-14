package matricediago;

public class superieur {
	int n;
    int [][]matrice;
    public superieur(int n)
	{this.n=n;
	 this.matrice= new int[n][n];
	 int c1=1;
	 for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if(i<j){
	        	matrice [i][j]=c1;
	            c1++;
			     }}}} 
    
public String toString ()
{
	 for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		         if(i<j) System.out.print(matrice [i][j]+"\t");
				else System.out.print("*\t");}
				 System.out.print("\n");
				 }return "";}
         }
