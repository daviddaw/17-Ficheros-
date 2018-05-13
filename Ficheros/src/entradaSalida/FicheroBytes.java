package entradaSalida;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FicheroBytes {


public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	String texto,nombreFich;
	System.out.println("Escribe el texto que va contener el fichero");
	texto=in.nextLine();
	System.out.println("Escribe el nombre del fichero");
	nombreFich=in.nextLine();
	File f = new File(nombreFich);// defino la ubicacion
	FileOutputStream fos;;
	int opcion;
	
	System.out.println("Escribe el nombre del fichero");

	try {
				System.out.println("Comprobando si existe...");
				if (!f.exists()) {
					System.out.println("El fichero No existe asi que lo creamos");
					 fos = new FileOutputStream(f);//objeto grabar
					if (f.exists()) {
						System.out.println("Fichero creado");

				
						char c[] =texto.toCharArray();
						System.out.println(texto);
						System.out.println(texto.length());
						for (int i = 0; i < c.length; i++) {
							fos.write((byte)c[i]);
						}
						
						
					}
					
				}

				do {
					do {

						System.out.println("elige una opción:" + "\n	1. Grabar." + "\n	2. Añadir texto." + "\n	3. Atras.");
						opcion = in.nextInt();
						System.out.println("Escribe un palabrsfds");
						/*String palabrea=in.nextLine();
						System.out.println(palabrea+"ea");*/
						

					switch (opcion) {
					case 1:
						System.out.println("Escribe un palabro");
						 texto=in.nextLine();
						
					System.out.println("Grabando...");

						fos = new FileOutputStream(nombreFich);
						 char c[] =texto.toCharArray();
							System.out.println(texto);
							System.out.println(texto.length());
							for (int i = 0; i < c.length; i++) {
								fos.write((byte)c[i]);
							}
						
						 

						 
						break;
					case 2:
/*						System.out.println("Añadiendo al final der archivo...");
						fos = new FileOutputStream(nombreFich,true);*/
			/*			char c[] =texto.toCharArray();
						System.out.println(texto);
						System.out.println(texto.length());
						for (int i = 0; i < c.length; i++) {
							fos.write((byte)c[i]);*/
						break;

					default:
						break;
					}
					} while (opcion < 1 || opcion > 3);
				} while (opcion != 3);//
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	in.close();
}

}
