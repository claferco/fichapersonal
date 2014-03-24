package fichapersonal;

import java.util.Scanner;

public class fichapers 


{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

	System.out.println("escriba nombre:");
	Scanner S1 = new Scanner (System.in);
	String nombre1=S1.next();

	System.out.println("escriba la edad:");
	Scanner S2 = new Scanner (System.in);
	int edad1=S2.nextInt();

	System.out.println("escriba el sexo:");
	Scanner S3 = new Scanner (System.in);
	char sexo1=S3.next().charAt(0);

	System.out.println("Ingrese casado:");
	Scanner S4 = new Scanner (System.in);
	char casado1=S4.next().charAt(0);

	System.out.println("Ficha personal");
	System.out.println("nombre: "+nombre1); 
	System.out.println("Edad: "+ edad1); 
	System.out.println("Sexo: "+sexo1);
	System.out.println("Casado:" +casado1);


		}
}
