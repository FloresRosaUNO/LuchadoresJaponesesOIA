import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Sumo {
	Torneo mp = new Torneo();
	int cant;
public void iniciar() throws IOException, CantLucha {
	FileReader in = new FileReader("C:\\Users\\rosae\\OneDrive\\Escritorio\\sumo.in.txt");
	BufferedReader bin = new BufferedReader(in);

	FileWriter out = new FileWriter("C:\\Users\\rosae\\OneDrive\\Escritorio\\lucha.txt");

	try {
		
		int a;
		String line;
		Luchador competidor;
		Torneo mp = new Torneo();
		ArrayList aux = new ArrayList();
		while ((line = bin.readLine()) != null) //Lee archivo
		   {    aux.add(line);
		   if(aux.size()>1) {
				competidor=crearCompe(line);
//				System.out.println("Peso: " + competidor.peso+ " Altura: " + competidor.altura);
				mp.agregar(competidor);			
		   }
		   else {
			   cant=Integer.parseInt(line);
				  if(cant<0 || cant>100000) throw new CantLucha();
				  }			  		
		}
		mp.Lucha();	
				
		int b=0;
		for (Integer e: mp.resul) {
			out.write(e+"\n");			
		}
			
		System.out.println("Se genero el archivo con los resultados");
		} finally {
			if(in !=null) {
				in.close();
			}
	
			if(out !=null) {
				out.close();
				}
			}
			
}
		
	private char[] print(String string) {
	// TODO Auto-generated method stub
	return null;
}

	private Luchador crearCompe(String linea)  {		
		int p;int h;		
		String[] atributos = linea.split(" ");                    
		p = Integer.parseInt(atributos[0]);		
		h = Integer.parseInt(atributos[1]);		
		return new Luchador(p,h);
	}

	public static void main(String[] args) 
        {
		
        Sumo torneo =new Sumo();
		try 
                {
			torneo.iniciar();
		} 
                catch (IOException  e) 
                {
			e.printStackTrace();
		}
	}
	
		
}//fin

