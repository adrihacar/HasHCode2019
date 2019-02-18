package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
	
	public static void main(String[] args) {
		

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
		
	}
	
	public void crearDrones(int numeroDrones) {
		//for (int i = 0; i < numeroDrones; i++)//int i = 0; i < city[2]; i++
			//drones[i] = new Dron();
	}

}
