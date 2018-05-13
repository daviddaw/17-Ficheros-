package entradaSalida;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicheroCaracteres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//apartado a
		System.out.println("Escribe el texto del fichero");
		String cadena =in.nextLine();
		//apartado b
		System.out.println("Escribe el nombre del fichero");
		String nombre=in.nextLine();
		File f = new File(nombre);
		FileWriter fw =null;
		char[] buffer=new char[50];
		//apartado d
		if (!(f.exists())) {
			System.out.println("No existe el archivo, vamos a crearlo");
			
			try {
				 fw = new FileWriter(f);
				buffer=cadena.toCharArray();
				fw.write(buffer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}finally {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//Menu
			int opcion;
			do {
				do {
					System.out.println("Elige una opci�n:" + "\n	1. Reescribir." + "\n	2. A�adir al final." + "\n	3. Continuar.");
					opcion = in.nextInt();
					in.nextLine();
				} while (opcion < 1 || opcion > 3);

				switch (opcion) {
				case 1:
					 try {
						 System.out.println("Escribe el nuevo texto");
						 cadena=in.nextLine();
						 fw = new FileWriter(f);
						 buffer=cadena.toCharArray();
						 fw.write(buffer);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					break;
				case 2:
					 try {
						 System.out.println("Escribe el nuevo texto");
						 cadena=in.nextLine();
						 fw = new FileWriter(f,true);
						 buffer=cadena.toCharArray();
						 fw.write(buffer);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;

				default:
					break;
				}

			} while (opcion != 3);//

		
		
		
		
		
		
		
		

		
		
		
		in.close();
	}

}
