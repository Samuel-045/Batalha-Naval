package batNaval;
import java.util.Scanner;
public class BatNaval {
	public static void main (String args[]) {
	   Scanner op= new Scanner (System.in);
	   int linha; 
	   int coluna;
	   int tent=0;
	  String [] [] oio = new String [6] [6];
	  
	  oio [0][0]="x";   oio [1] [0]="x";   oio [2] [0]="x";
	  oio [0][1]="a";   oio [1] [1]="x";   oio [2] [1]="x";
	  oio [0][2]="a";   oio [1] [2]="x";   oio [2] [2]="x";
	  oio [0][3]="x";   oio [1] [3]="x";   oio [2] [3]="x";
	  oio [0][4]="x";   oio [1] [4]="a";   oio [2] [4]="x";
	  oio [0][5]="x";   oio [1] [5]="x";   oio [2] [5]="a";
	  
	  oio [3][0]="x";   oio [4] [0]="a";   oio [5] [0]="x";
	  oio [3][1]="x";   oio [4] [1]="x";   oio [5] [1]="x";
	  oio [3][2]="a";   oio [4] [2]="x";   oio [5] [2]="x";
	  oio [3][3]="a";   oio [4] [3]="x";   oio [5] [3]="a";
	  oio [3][4]="x";   oio [4] [4]="x";   oio [5] [4]="a";
	  oio [3][5]="x";   oio [4] [5]="x";   oio [5] [5]="x";
	 
	  
	  System.out.println("Você terá 5 chances de acertar! (lembrando que as posições começam do 0 e terminam no 5)");
	   for (int p=0; p<5; p++) {
		   	tent=p+1;
			System.out.println("-"+tent+"º Tentativa");
			
			System.out.println("Digite a linha");
			linha=op.nextInt();
			
			
			System.out.println("Digite a coluna");
			coluna=op.nextInt(); 
			if (oio[linha][coluna].equalsIgnoreCase("a")) {
				 System.out.println("acertou\n");
			 }else {
				 System.out.println("errou\n");
			 }	
	   }
	   
	   System.out.println("-------Resposta-------");
	   for (int s=0; s<6; s++) {
			 for (int w=0; w<6;w++) {
				 System.out.print(oio[s][w]+" ");
			 }System.out.println(" ");	 
	   }
	  
	   op.close();
	}
}