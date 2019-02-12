package paquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	//1=Tomate 
	//2=Champi
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
		
		
		int num_temp;
		//si hay un 5 esque hay error
		for(int i=0;i<rows;i++) {
			linea=br.readLine();
			for(int c=0;c<colum;c++) {
				num_temp=5;
				if(linea.charAt(c)=='T') {
					num_temp=1;
				}
				if(linea.charAt(c)=='M') {
					num_temp=2;
				}
				Pizza[i][c]=num_temp;
			}
			
		}
		br.close();
		System.out.println("Filas: "+rows);
		System.out.println("Columnas: "+colum);
		
		

	}

}
