import java.util.ArrayList;
public class Torneo {

	ArrayList<Luchador> competidores = new ArrayList<Luchador>();
	ArrayList<Integer> resul = new ArrayList<Integer>();
public void agregar(Luchador a) {
	competidores.add(a);
}
public void ver() {
	
	for(Luchador e: competidores) {
		System.out.println("Luchador "+e.hashCode()+" peso: "+e.peso+" altura: "+e.altura);
	}
}

public void Lucha() {
	for(Luchador e: competidores) {
		for(Luchador f: competidores) {
//			System.out.println(e.peso+" "+f.peso+" y "+e.altura+" "+f.altura);
			if((e.peso>f.peso && e.altura>f.altura)
				||(e.peso==f.peso && e.altura>f.altura)
				|| (e.peso>f.peso && e.altura==f.altura)) {
				e.gana++;
//			System.out.println("Gana "+e.hashCode());
			}
		}
		resul.add(e.gana);
	}

	System.out.println("resultados  "+resul);	
}
}
