package bucles;

import javax.swing.*;

public class array1 {

	public static void main(String[] args) {
		String [] paises=new String[8];
		 /*int [] mi_matriz=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=4;
		mi_matriz[2]=54;
		mi_matriz[3]=53;
		mi_matriz[4]=62;
		
	for(int i=0;i<mi_matriz.length;i++) {
		
		System.out.println(mi_matriz[i]);
	}*/
		for (int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("introduce pais " + (i+1));
		}
		
		for (String elemento:paises) {
			System.out.println("Pais: " + elemento);
		}
		for (String elemento:paises) {
			System.out.println("Pais: " + elemento);
		}
		for (String elemento:paises) {
			System.out.println("Pais: " + elemento);
	}
	}

}
