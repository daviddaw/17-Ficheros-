package entradaSalida;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatosPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout=null;
		DataOutputStream dout=null;
	    FileInputStream fin = null;
		DataInputStream din = null;
		Alumno alumno1 = null;
		
//creas estram con datos de alumnos
		try {
			fout=new FileOutputStream("david.txt");
			dout =new DataOutputStream(fout);//es este
			

			try {
				alumno1=new Alumno(1, "David", false, 8);
				alumno1.volcarFichero(dout);
				alumno1=new Alumno(2, "Marco", false, 7);
				alumno1.volcarFichero(dout);
				alumno1=new Alumno(3, "Hector",false, 9);
				alumno1.volcarFichero(dout);
				alumno1=new Alumno(4, "Lucia", false, 7.5);
				alumno1.volcarFichero(dout);
				System.out.println(dout.size());
				dout.flush();
				dout.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//aRCHIVO DE SALIDA DE DATOS
			
			
			
			
			

			
			try {
				fin=new FileInputStream("david.txt");
				din=new DataInputStream(fin);
				while (din.available()>0) {
					alumno1.leerFichero(din);
					alumno1.mostrarFicha();
					
					
				}
				din.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	


		//	dar de alta aliumos
		
		
	}

}
