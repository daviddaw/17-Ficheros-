package entradaSalida;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FicheroBytes {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		String cadena,nombreFich;
		char[] c;
		//Apartado a
		System.out.println("Escribe el texto que va contener el fichero"); 
		cadena=in.nextLine();//leola linea compleata ylo guardo en un String
		//Apartado b
		System.out.println("Escribe el nombre del fichero");
		nombreFich=in.next();//leo la linea completa y la guardo en un string
		File f = new File(nombreFich);// defino la ubicacion
		FileOutputStream fos ; //declaro el stream
		try {
		//apartado d inicio	
		if (!(f.exists())) {//si no existe el fichero
			System.out.println("No existe entonces lo creo");
		//Apartado c.	
					fos = new FileOutputStream(f); //creo el fichero aqui tengo dudas   //flujo de salida de archivo   
					 c =cadena.toCharArray();    //guardo el String en un array de caracteres
					 //Apartado e
					for (int i = 0; i < c.length; i++) { //recorro el array carcter por carcter
						try {
							fos.write((byte)c[i]);   //escribo cada posicion del caracter en el archivo conwrite
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}	
					fos.close();
			
			System.out.println("archivo "+f+" creado");
			
		}			
				int opcion;
				do {//do while con un tres sale del programa
					do {//perite un numero entre 1y 3
						System.out.println("\nExiste y menu" //menu
								+ "\n1. Reescribir fichero"
								+ "\n2. Añadir al final"
								+ "\n3. Continuar");
					opcion = in.nextInt();//Elegimos opciondel menu
					in.nextLine();///necesitamos limpiar el buffer del scannerantes de usar nextLine();
					
					switch (opcion) {
					case 1://como elijo uno
						System.out.println("Escribe una cadena");//mensaje
						 cadena=in.nextLine();
						 fos = new FileOutputStream(f);
						 
						  c =cadena.toCharArray();//igual que el anterior
							System.out.println(cadena);
							System.out.println(cadena.length());
							for (int i = 0; i < c.length; i++) {
								try {
									fos.write((byte)c[i]);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							fos.close();
						break;
					case 2://aqui aun no he llegado
						System.out.println("Escribe una cadena para añadirla al final");//mensaje
						 cadena=in.nextLine();
						fos = new FileOutputStream(f,true);
						  c =cadena.toCharArray();
							System.out.println(cadena);
							System.out.println(cadena.length());
							for (int i = 0; i < c.length; i++) {
								try {
									fos.write((byte)c[i]);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
							fos.close();
						
						break;

					default:
						
						break;
					}
					} while (opcion < 1 || opcion > 3);
				} while (opcion != 3);//
				
//apartado d fin
				//apartado f
				cadena= "";
				FileInputStream fis = new FileInputStream(f);	 //objeto fis para leer
				int size=fis.available(); //tenemos que saber el numero de caracteres que tenemos
				//cojo los caracteres y los guardo en un char[]
				 c = new char[size];
				for (int i = 0; i < size; i++) {
					
					c[i]=(char)fis.read();
					cadena+=c[i];
				}
				System.out.println(cadena);
				
				fis.close();
		
		 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
				in.close();
	}

}
