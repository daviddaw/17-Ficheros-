package entradaSalida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContarLineas {

    public static void main(String[] args)  {
    	Scanner in = new Scanner(System.in);

		

    	File archivo;
    	BufferedWriter bw = null;
        try {
        	archivo=new File("archivo10.txt");
        	if (archivo.createNewFile()) {
				System.out.println("Se ha creado el archivo");
			}else {
				System.out.println("No se ha podido crear es posible que ya exista");
			}
			//contarLineas("archivo10.txt");//le pasamos un archivo que en este caso es la ruta
			
			bw=new BufferedWriter(new FileWriter(archivo));
			String cad;
			
			System.out.println("introduce cadena  *");
			//cad=in.nextLine();
			//in.nextLine();
			int contador=1;
			cad=in.nextLine();
			while (!cad.equals("*")) {
				
				bw.write(contador+cad);
				bw.newLine();
				cad=in.nextLine();
				contador++;
			}
			System.out.println("El archivo tiene "+contador+" lineas");
			
			
			
			
			
		} catch (IOException e) {//cogeremos los errores con el objeto e
			// TODO Auto-generated catch block
			System.out.println("Mensaje: " + e.getMessage());//imprimimos el mensaje de error
		}
        finally {
			
				try {
					if (bw!=null) {
					bw.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
        in.close();
    }
    
    
    public static void contarLineas(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo); //recibimos la ruta y con ella creamos un fileReader que permite leer ficheros
        BufferedReader b = new BufferedReader(f);// pasandole el filereader al buferedreader permite que leamos lineas enteras
        int linea = 0; //cree una variable linea
        boolean leido=false;
        while(    (cadena = b.readLine()) !=null || leido) {// mientras una linea exista o  leido cambie a true
        	if (linea==1) {//cuando la linea valga 1
        		System.out.println(cadena); //imprima la linea
        		leido=true;
			}        
            linea++; //cada vuelta aumenta en uno la linea
        }
        b.close();//  !!! cerramos archivo
    }

}
