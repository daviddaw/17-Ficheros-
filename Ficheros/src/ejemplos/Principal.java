package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
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

    public static void main(String[] args)  {
    	File archivo;
        try {
        	archivo=new File("C:/Users/Daveto/OneDrive/Documents/archivo2.txt");
        	if (archivo.createNewFile()) {
				System.out.println("Se ha creado el archivo");
			}else {
				System.out.println("No se ha podido crear es posible que ya exista");
			}
			muestraContenido("C:/Users/Daveto/OneDrive/Documents/archivo.txt");//le pasamos un archivo que en este caso es la ruta
			
		} catch (IOException e) {//cogeremos los errores con el objeto e
			// TODO Auto-generated catch block
			System.out.println("Mensaje: " + e.getMessage());//imprimimos el mensaje de error
		}
     
    }
   
}