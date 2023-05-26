package bucles;

import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner entrada=new Scanner(System.in);
		int variable=1;
		System.out.println("Mete un numero");
		variable=entrada.nextInt ();
		
		System.out.println("tu numero "+ variable);
		int variable=(int)(Math.random()*2+1);
        switch(variable){
            case 1:
                System.out.println("que gay");
                break;
            case 2:
                System.out.println("No es gay");
        
	}

        René Rodríguez22:54
        do {
                    salida=true;
                    System.out.println("Elige una opcion");
                    System.out.println("--> 1 prueba");
                    System.out.println("--> 2 tambien prueba");
                    opt = ent.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("eres gay");
                            break;
                        case 2:
                            System.out.println("no eres gay");
                            break;
                        default:
}
