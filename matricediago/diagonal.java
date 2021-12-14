package matricediago;

public class diagonal {
	int n;
    int [][]matrice = new int[n][n];
    
 public diagonal(int n) {
	 this.n=n;
	 this.matrice= new int[n][n];
	   for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            if(i==j) matrice[i][j]=i;
            }
 public String toString()
 {for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
         if(i==j)System.out.print(matrice[i][i]+"\t");
 		else System.out.print("*\t");}
 		System.out.print("\n");
 		}
 return "";}

}
