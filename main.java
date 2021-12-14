
import java.util.Scanner;

import cruse.*;
import matricediago.*;
import dynamique.*;
import newprojet.*;

public class main {
	public static void main(String[] args) {
		
		Scanner scan;	
	    scan = new Scanner(System.in);
		System.out.println("MENUS");
		System.out.println("");
		System.out.println("0-->fermer le programme");
		System.out.println("1-->pour afficher une partie de la matrice ");
		System.out.println("2-->pour afficher plusieurs partie de cette matrice");
		System.out.println("3-->pour afficher les matrices creuses");
		System.out.println("4-->manupiler les matrices");
		System.out.println("7-->manupiler les matrices creuses");
		System.out.println("");
		System.out.println("choisir le nombre qui vous convient je vous conseigne par le numero 7");
		
		var choix1= Integer.parseInt(scan.nextLine());
		System.out.println("");
		System.out.println("vous aves choisie le nombre "+choix1);
		System.out.println("");
		switch(choix1)
		{
		case 0 :{System.out.println("le programme a terminer");
		         break;}
		case 1 :{
			System.out.println("MENUS");
			System.out.println("");
			System.out.println("1-->Matrice statique");
			System.out.println("2-->Matrice dynamique");
			System.out.println("");
			System.out.println("choisir le nombre qui vous convient");
			var choix2 = Integer.parseInt(scan.nextLine());
			System.out.println("");
			System.out.println("vous aves choisie le nombre "+choix2);
			System.out.println("");
			switch(choix2)
			{case 1 :{
			     System.out.println("MENUS");
		         System.out.println("");
		         System.out.println("1-->Matrice inferieur  ");
		 		 System.out.println("2-->Matrice diagonal ");
		 		 System.out.println("3-->Matrice superieur ");
		 	   	 System.out.println("");
		 	   	 System.out.println("choisir le nombre qui vous convient");
		 	   	 int choix3= Integer.parseInt(scan.nextLine());
		 	   	 System.out.println("");
				 System.out.println("vous aves choisie le nombre "+choix3);
				 System.out.println("");
				 switch(choix3)
				 {
				 case 1 :{
					     System.out.println("Saisir la taile de la matrice");
					     int N =Integer.parseInt(scan.nextLine());
					     System.out.println("Matrice inferieur");
						 new inferieur(N).toString();
						 break;
				         }
				 case 2 :{
				         System.out.println("Saisir la taile de la matrice");
				         int N =Integer.parseInt(scan.nextLine());
				         System.out.println("Matrice Diagnal");
						 new diagonal (N).toString();
						 break;
			             }
				 case 3 :{
			             System.out.println("Saisir la taile de la matrice");
			             int N =Integer.parseInt(scan.nextLine());
			             System.out.println("Matrice superieur");
			    		 new superieur(N).toString();
			    		 break;
		                 }
				 default : {System.out.println("le programme a terminer");
					 break;
				 }
				 }
				 break;
		         }
			case 2 :{
				 System.out.println("MENUS");
		         System.out.println("");
		         System.out.println("1-->Matrice inferieur  ");
		 		 System.out.println("2-->Matrice diagonal ");
		 		 System.out.println("3-->Matrice superieur ");
		 	   	 System.out.println("");
		 	   	 System.out.println("choisir le nombre qui vous convient");
		 	   	 int choix3= Integer.parseInt(scan.nextLine());
		 	   	 System.out.println("");
				 System.out.println("vous aves choisie le nombre "+choix3);
				 System.out.println("");
				 switch(choix3)
				 {
				 case 1 :{
					     System.out.println("saisir la taile de la matrice");
					     int N =Integer.parseInt(scan.nextLine());
					     System.out.println("Matrice dynamique inferieur");
						 new matricedynamiqueinferieur(N).toString();
						 break;
				         }
				 case 2 :{
				         System.out.println("saisir la taile de la matrice");
				         int N =Integer.parseInt(scan.nextLine());
				         System.out.println("Matrice dynamique diagonal");
						 new matricedynamiquediagonal(N).toString();
						 break;
			             }
				 case 3 :{
			             System.out.println("saisir la taile de la matrice");
			             int N =Integer.parseInt(scan.nextLine());
			             System.out.println("Matrice dynamique superieur");
			    	     new matricedynamiquesuperieur(N).toString();
			    		 break;
		                 }
				 default : {System.out.println("le programme a terminer");
				 break;
			 }
			 }
				 break;
		         }
			default : {System.out.println("le programme a terminer");
			 break;
		 }
		 }
			break;
			}
	
		case 2 :{
			System.out.println("MENUS");
			System.out.println("");
			System.out.println("1-->Matrice inferieur et superieur");
			System.out.println("2-->Matrice inferieur et diagonal");
			System.out.println("3-->Matrice diagonal et superieur");
			System.out.println("4-->Matrice inferieur et diagonal et superieur");
			System.out.println("");
			System.out.println("choisir le nombre qui vous convient");
			int choix2 = Integer.parseInt(scan.nextLine());
			System.out.println("");
			System.out.println("vous aves choisie le nombre "+choix2);
			System.out.println("");
			switch(choix2)
			{
			case 1 :{
				   System.out.println("Saisir la taile de la matrice");
	               int N =Integer.parseInt(scan.nextLine());
	               System.out.println("Matrice inferieur et superieur");
				   Matrice m = new  Matrice(N);
			       m.matriceinferieur();
			       m.matricesuperieur();
			       m.toString();
			       break;
			       }
			case 2 :{
			       System.out.println("Saisir la taile de la matrice");
                   int N =Integer.parseInt(scan.nextLine());
                   System.out.println("Matrice inferieur et diagonal");
			       Matrice m = new  Matrice(N);
		           m.matriceinferieur();
		           m.matriceidentite();
		           m.toString();
		           break;
		           }
			case 3 :{
			       System.out.println("Saisir la taile de la matrice");
	               int N =Integer.parseInt(scan.nextLine());
	               System.out.println("Matrice diagonal et superieur");
		           Matrice m = new  Matrice(N);
		           m.matriceidentite();
                   m.matricesuperieur();
		           m.toString();
		           break;
		           }
			case 4 :{
				   System.out.println("Saisir la taile de la matrice");
		           int N =Integer.parseInt(scan.nextLine());
		           System.out.println("Matrice inferieur et diagonal et superieur");
			       Matrice m = new  Matrice(N);
				   m.matricesuperieur();
			       m.matriceidentite();
			       m.matriceinferieur();
			       m.toString(); 
			       break;
			       }
			default : {System.out.println("le programme a terminer");
			 break;
		 }
		 }
			break;
		}
		case 3 :{
			System.out.println("MENUS");
			System.out.println("");
			System.out.println("1-->Matrice creuse avec 2 indice");
			System.out.println("2-->matrice creuse avec 1 indice");
			System.out.println("3-->matrice creuse lineaire");
			System.out.println("");
			System.out.println("choisir le nombre qui vous convient");
			int choix2 = Integer.parseInt(scan.nextLine());
			System.out.println("");
			System.out.println("vous aves choisie le nombre "+choix2);
			System.out.println("");
			switch(choix2)
			{
			case 1 :{
				   System.out.println("Saisir la taile de la matrice");
	               int N =Integer.parseInt(scan.nextLine());
	               System.out.println("Matrice cruse avec 2 indice ");
				   Matrice m = new  Matrice(N);
				   m.matricesuperieur();
			       m.matriceidentite();
			       m.matriceinferieur();
			       new cruse2indice(m).toString();
			       break;
			       }
			case 2 :{
			       System.out.println("Saisir la taile de la matrice");
                   int N =Integer.parseInt(scan.nextLine());
                   System.out.println("Matrice cruse avec 1 indice");
			       Matrice m = new  Matrice(N);
			       m.matricesuperieur();
			       m.matriceidentite();
			       m.matriceinferieur();
			       new cruse1indice(m).toString();
			       break;
		           }
			case 3 :{
			       System.out.println("Saisir la taile de la matrice");
	               int N =Integer.parseInt(scan.nextLine());
	               System.out.println("Matrice cruse lineaire");
		           Matrice m = new  Matrice(N);
		           m.matricesuperieur();
			       m.matriceidentite();
			       m.matriceinferieur();
			       new cruselinealiser(m).toString();
			       break;
		           }
			default : {System.out.println("le programme a terminer");
			 break;
		 }
		 }
			break;
		}
		case 4 :{
			System.out.println("MENUS");
			System.out.println("");
			System.out.println("1-->Matrice transpose");
			System.out.println("2-->addition des matrices");
			System.out.println("3-->multuplication des matrices");
			System.out.println("");
			System.out.println("choisir le nombre qui vous convient");
			int choix2 = Integer.parseInt(scan.nextLine());
			System.out.println("");
			System.out.println("vous aves choisie le nombre "+choix2);
			System.out.println("");
			switch(choix2)
			{
			case 1 :
			{
				Matrix M1 =new Matrix();
			    M1.create();
			    System.out.println("Matrice ");
			    M1.toString();
			    Matrix M2 =new Matrix();
			    M2.trans(M1);
			    System.out.println("transpose");
			    M2.toString();
			    break;
			}
			
			case 2 :
			{
			    Matrix M1 =new Matrix();
			    M1.addition();
			    System.out.println("Additionn");
			    M1.toString();
			    break;
			}
			case 3 :
			{
			    Matrix M1 =new Matrix();
			    M1.mult();
			    System.out.println("multiplication");
			    M1.toString();
			    break;
			}
			default : {System.out.println("le programme a terminer");
			 break;}
			}
			break;
		}
		case 7 :{
			System.out.println("MENUS");
			System.out.println("");
			System.out.println("1-->Creer une matrice ");
			System.out.println("2-->creer une matrice creuse avec 2 indice");
			System.out.println("3-->creer une matrice creuse avec 1 indice");
			System.out.println("4-->creer une matrice creuse lineaire");
			System.out.println("");
			System.out.println("choisir le nombre qui vous convient");
			int choix2 = Integer.parseInt(scan.nextLine());
			System.out.println("");
			System.out.println("vous aves choisie le nombre "+choix2);
			System.out.println("");
			switch(choix2)
			{
			
			case 1 :{  
				
				Matrix M =new Matrix();
			    M.create();
			    System.out.println("Matrice");
			    M.toString();
			    System.out.println("Matrice -> Matrice lineaire");
			    new lineaire(M).toString();
			    System.out.println("Matrice -> Matrice creuse avec 1 indice");
			    new Matrix1indice(M).toString();
			    System.out.println("Matrice -> Matrice creuse avec 2 indice");
			    new Matrix2indice(M).toString();
			    System.out.println("\n");
				break;
			}
			case 2 :{	
		
				 Matrix2indice M2 = new Matrix2indice();
				 M2.create();
				 System.out.println("Matrice creuse avec 2 indice");
				 M2.toString();
				 System.out.println("Matrice creuse avec 2 indice ->Matrice creuse avec 1 indice");
				 new Matrix1indice(M2).toString();
				 System.out.println("Matrice creuse avec 2 indice ->Matrice lineaire");
			  	 new lineaire(M2).toString();
			  	 System.out.println("Matrice creuse avec 2 indice ->transpose");
			  	 M2.trans();
				 break;
				 }
			case 3 :{	
				
				Matrix1indice M1 = new Matrix1indice();
				 M1.create();
				 System.out.println("Matrice creuse avec 1 indice");
				 M1.toString();
				 System.out.println("Matrice creuse avec 1 indice ->Matrice creuse avec 2 indice");
				 new Matrix2indice(M1).toString();
				 System.out.println("Matrice creuse avec 1 indice ->Matrice lineaire");
			  	 new lineaire(M1).toString();
			  	System.out.println("Matrice creuse avec 1 indice ->transpose");
			  	 M1.trans();
				 break;
				 }
			case 4 :{
		
			 lineaire g = new lineaire();
			 g.create();
			 System.out.println("Matrice lineaire");
			 g.toString();
			 System.out.println("Matrice lineaire ->Matrice creuse avec 1 indice ");
			 new Matrix1indice(g).toString();
			 System.out.println("Matrice lineaire ->Matrice creuse avec 2 indice ");
			 new Matrix2indice(g).toString();
			 break;}
			 default : {System.out.println("le programme a terminer");
			 break;
		            }
		 }
		break;	
		}
		default : {System.out.println("le programme a terminer");
		 break;
	 }
		}	
	scan.close();
	}   

}
