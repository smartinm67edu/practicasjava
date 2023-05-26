package bucles;
import java.util.Scanner;
public class Ciclo_n_pares {
	public static void main (String [] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("¿Cuantos numeros quieres sumar?");
		int num=sc.nextInt();
		int suma=0;
			for (int i=0; i<num; i+=2) {
				suma = suma+2;
			}
			System.out.println(suma);
	}

}
