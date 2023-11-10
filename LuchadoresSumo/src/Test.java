
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Luchador a =new Luchador(10,1500);
Luchador b =new Luchador(15,1200);
Luchador c =new Luchador(19,1700);
Luchador d =new Luchador(7,1500);

Torneo ma = new Torneo();

ma.competidores.add(a);
ma.agregar(b);
ma.agregar(c);
ma.competidores.add(d);

ma.ver();

ma.Lucha();

	}

}
