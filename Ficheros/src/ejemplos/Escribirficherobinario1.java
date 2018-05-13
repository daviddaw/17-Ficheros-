package ejemplos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Escribirficherobinario1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		FileOutputStream f =null;
		System.out.println("Inntroduzca lacadena de texto a grabaren el fichero");
		String cad=in.nextLine();
		char c;
		try {
			f=new FileOutputStream("datos.txt");
			for (int i = 0; i < cad.length(); i++) {
				c=cad.charAt(i);
				f.write((byte)c);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
			f.close();
			
		}
		catch (IOException e) {
			System.out.println(e);
			

				}
			}
	}
}