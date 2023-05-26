package bucles;

import java.util.Scanner;

public class JavaApplication219 {
 
     
    public static void main(String[] args) {
         
       try (Scanner sc = new Scanner(System.in)) {
    	   boolean salir = false;
		   int opcion; 
		    
		   while(!salir){
		        
		       System.out.println("1. Opcion 1");
		       System.out.println("2. Opcion 2");
		       System.out.println("3. Opcion 3");
		       System.out.println("4. Opcion 4");
		       System.out.println("5. Salir");
		        
		       System.out.println("Escribe una de las opciones");
		       opcion = sc.nextInt();
		        
		       switch(opcion){
		           case 1:
		        	   Scanner sn = new Scanner(System.in);
				        System.out.print("Introduzca numero de filas: ");
				        int numFilas = sc.nextInt();
				        sc.close();
				 
				        System.out.println();
				        for(int altura = 1; altura<=numFilas; altura++){
				            //Espacios en blanco
				            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
				                System.out.print(" ");
				            }
				 
				            //Asteriscos
				            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
				                System.out.print("*");
				            }
				            System.out.println();
				        }
				        
				    break;
		           case 2:
		       		// Cuadrado
		  			 	int li=10;
						System.out.println("Cuadrado");
						System.out.println("--------\n");
				 
						for(int i=0;i<li;i++)
						{
							for(int j=0;j<li;j++)
							{
								System.out.print("*");
							}
							System.out.print("\n");
						}
		               break;
		            case 3:
		            	//triangulo
		            	int tr=20;
		            	
		            	System.out.println("triangulo");
		            	System.out.println("--------\n");
		            	
		            	for(int f=0,f>tr,f++) {
		            		
		            	} 
		               
		               break;
		            case 4:
		            	 /*System.out.println("\n\nTriangulo");
						System.out.println("------\n");
						
				
						for(int i=1;i<=(lineas/2);i++)
						{
							for(int j=0;j<i;j++)
							{
								System.out.print("*");
							}
							System.out.print("\n");
						}
		               */
		            case 5:
		            	salir=true;
			               break;
			               
		            default:
		               System.out.println("Solo números entre 1 y 4");
		       }
		        
		   }
	}
        
    }
     
}
