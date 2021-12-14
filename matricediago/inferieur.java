package matricediago;

public class inferieur {
	int n;
    int [][]matrice;
	public inferieur(int n)
	{this.n=n;
	 this.matrice= new int[n][n];
	int c2=1;
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if(i>j){ matrice[i][j]=c2;
	            c2++;
	            }
	        else {matrice [i][j]=-1;}}}}
	
	public String toString()
	{
		 for(int i=0;i<n;i++){
			    for(int j=0;j<n;j++){
			         if(i>j) System.out.print(matrice [i][j]+"\t");
					else System.out.print("*\t");}
					 System.out.print("\n");
					   }
		 return "";}
	
	}

