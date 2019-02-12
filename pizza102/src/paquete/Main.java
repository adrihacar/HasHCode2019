package paquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	//1=Tomate 
	//0=Champi
	public static int Pizza[][];
	public static int rows;
	public static int colum;
	public static int min; //minimo cada ingrediente
	public static int max; //total maximo de ingredientes
	
	
	public static void main(String[] args) throws IOException {
		//input
		String archivo_pruebas="Pruebas/a_example.in";
		//input
		
		FileReader fichero = new FileReader(archivo_pruebas);
		BufferedReader br = new BufferedReader(fichero);
		
		String linea=br.readLine();
		String[]datos=linea.split(" ");
		
		//rclh
		rows=Integer.parseInt(datos[0]);
		colum=Integer.parseInt(datos[1]);
		min=Integer.parseInt(datos[2]);
		max=Integer.parseInt(datos[3]);
		
		//creamos matriz
		Pizza=new int[rows][colum];
		
		char char_temp;
		for(int i=0;i<rows;i++) {
			linea=br.readLine();
			for(int c=0;c<colum;c++) {
				char_temp=linea.charAt(c);
				Pizza[i][c]=(int)char_temp;
			}
			
		}
		br.close();
		System.out.println("Filas: "+rows);
		System.out.println("Columnas: "+colum);
		
		

	}

}
