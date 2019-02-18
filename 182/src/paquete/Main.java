package paquete;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static int rows;
	public static int colum;
	public static int num_drones;
	public static int turns_maxima;
	public static int carga_maxima;
	public static int carga_tipo[];
	public static Warehouses arr_warehouse[];

	public static void main(String[] args) throws IOException {
		entrada();
		Dron drones[] = new Dron[num_drones];
		for (int i = 0; i < num_drones; i++)
			drones[i] = new Dron(arr_warehouse[0].x,arr_warehouse[0].y);

	}
	
	public static int distancia(int xi, int yi, int xf, int yf) {
		return (int)Math.abs(Math.sqrt(Math.pow(xi-xf, 2)+Math.pow(yi-yf, 2)));
	}
	
	
	public static void entrada() throws IOException {
		//input
		String archivo_pruebas="Pruebas/a_example.in";
		//input
				
		FileReader fichero = new FileReader(archivo_pruebas);
		BufferedReader br = new BufferedReader(fichero);
				
		String linea=br.readLine();
		String[]datos=linea.split(" ");
				
		
		rows=Integer.parseInt(datos[0]);
		colum=Integer.parseInt(datos[1]);
		num_drones=Integer.parseInt(datos[2]);
		turns_maxima=Integer.parseInt(datos[3]);
		carga_maxima=Integer.parseInt(datos[4]);
		
		linea=br.readLine();
		carga_tipo=new int[Integer.parseInt(linea)];
		
		//pesos por tipo
		linea=br.readLine();
		datos=linea.split(" ");
		
		//meter cargas
		for(int i=0;i<carga_tipo.length;i++) {
			carga_tipo[i]=Integer.parseInt(datos[i]);
		}
		
		linea=br.readLine();
		arr_warehouse=new Warehouses[Integer.parseInt(linea)];
		
		for(int i=0;i<arr_warehouse.length;i++) {
			linea=br.readLine();
			datos=linea.split(" ");
			arr_warehouse[i].x=Integer.parseInt(datos[0]);
			arr_warehouse[i].y=Integer.parseInt(datos[1]);
			
			arr_warehouse[i].cantidad=new int[carga_tipo.length];
			linea=br.readLine();
			datos=linea.split(" ");
			
			for(int c=0;c<datos.length;c++) {
				arr_warehouse[i].cantidad[c]=Integer.parseInt(datos[c]);
			}
			
}
		
	}
	
	

}
