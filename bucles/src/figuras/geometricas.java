package figuras;

import java.util.Scanner;

public class geometricas {

		public static void main(String args[]){
			
		
			Scanner sn = new Scanner(System.in);
	        System.out.print("diga un numero del 0 al 2");
	        int f = sn.nextInt();
	        sn.close();
			
			
			switch(f) {
			  case 0:
				  int lineas = 10;
					 
					// Cuadrado
			 
					System.out.println("Cuadrado");
					System.out.println("--------\n");
			 
					for(int i=0;i<lineas;i++)
					{
						for(int j=0;j<lineas;j++)
						{
							System.out.print("*");
						}
						System.out.print("\n");
					}
			    break;
			  case 1:
			
				 /* System.out.println("\n\nTriangulo");
					System.out.println("------\n");
					
			
					for(int i=1;i<=(lineas/2);i++)
					{
						for(int j=0;j<i;j++)
						{
							System.out.print("*");
						}
						System.out.print("\n");
					}*/
			    break;
			  case 2:
			        Scanner sc = new Scanner(System.in);
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
			  case 3:
				  int li = 10;
					 
					// Cuadrado
			 
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
			  default:
			    System.out.println("i es mayor a tres.");
			}
		
			
	 
			
			
			
				
			   }
	 
		}

