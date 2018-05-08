package ejemplos;

import java.io.File;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
		if (args.length==0) {
			
			Exception e = new Exception("El programa no tiene argumentos: hay que escribir uno o varios nombres de fichero o directorio.");
		
				throw e;

		}else {
			
				int opcion;
				do {
					do {
						System.out
								.println("Elige una opción:" + "\n	1. Ejercicio1." + "\n	2. Ejercico2." + "\n	3. Atras.");
						opcion = in.nextInt();
					} while (opcion < 1 || opcion > 3);

					switch (opcion) {
					////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////case1
					case 1:
						for (int i = 0; i < args.length; i++) {
							propiedades(args[i]);//String
							
						}
						break;
						//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////case2
					case 2:
						System.out.println("De manera recursiva");
						File file = null;
						
						
				for (int i = 0; i < args.length; i++) {
					
					file = new File(args[i]);
					if (file.isDirectory()) {
						
						propiedades(file); 
					}
					
					 //			
						}
				 //pasarle un file pero el file lleva un string ruta
						break;

					default:
						break;
					}

				} while (opcion != 3);//

			

		}
			
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}	
		
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////case1//////////////////////////////////////////////////

	private static void propiedades(String string) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un fichero(archivo) o un  directorio(carpeta) ");
		string=in.next();
		File file = new File(string);
		long fecha;
		try {
			

		if (!(file.exists())) {
			ExcepcionficheroNoExiste e= new ExcepcionficheroNoExiste("Excepcion Fichero No Existe");
			throw e;
		}else {
			 Date date = new Date(file.lastModified());

			if (file.isFile()) {
          
          
				System.out.println("Datos del fichero"+
						"\n Nombre del fichero: "+file.getName()+
						"\n Ruta relativa: "+file.getPath()+
						"\n Ruta absoluta: "+file.getAbsolutePath()+
						"\n ¿Se puede leer? "+file.canRead()+
						"\n ¿Se puede escribir? "+file.canWrite()+
						"\n Tamaño: "+file.length()+
						"\n Ultima modificación: "+date);

			}
			if (file.isDirectory()) {
				System.out.println("Datos del directorio"+
						"\n Nombre del directorio: "+file.getName()+
						"\n Ruta relativa: "+file.getPath()+
						"\n Ruta absoluta: "+file.getAbsolutePath()+
						"\n ¿Se puede leer? "+file.canRead()+
						"\n ¿Se puede escribir? "+file.canWrite()+
						"\n Tamaño: "+file.length()+
						"\n Ultima modificación: "+date);


}
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	//	return file;
		
	}//fin case1
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////case2
	private static File propiedades(File file) {
	System.out.println("le pasamos al programa  "+file);
		try {
			if (!(file.exists())) {//Si el fichero no existe sacamos un mensaje indicandolo
				ExcepcionficheroNoExiste e= new ExcepcionficheroNoExiste("Excepcion Fichero No Existe");
				throw e;
			}else if(file.isFile()) {
				System.out.println(file.getAbsolutePath());
				
			}else {
				
				//miro si hay carpeta 
				Thread.sleep(200);
				
				for (int i = 0; i < file.listFiles().length; i++) {//buscamos subdirectorios
					if (file.listFiles()[i].isDirectory()) {//En caso de que haya un subdirectorio 
						System.out.println("tiene el subdirectorio "+file.list()[i]);
						propiedades(file.listFiles()[i]);//lo que hay dentrodelsubdirectorio
					}
					
					
					System.out.println(file.listFiles()[i]);//lo que hay dentro del directorio
				}
				
				//llamar recursivo
				//Thread.sleep(2000);
				
				
				


				
				
				
			
			}
			
		} catch (InterruptedException e) {
		
		} catch (ExcepcionficheroNoExiste e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return file;
		
		
	}

}
