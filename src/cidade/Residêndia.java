package cidade;

public class Residêndia {
	public static void main(String []args) {
		Moradia casa2 = new Moradia ("Casa",2);
		Moradia casa3 = new Moradia ("Casa",3);
		Moradia casa4 = new Moradia ("Casa",4);
		Moradia ap2 = new Moradia ("Apartamento", 2);
		Moradia ap3 = new Moradia ("Apartamento", 3);
		
		casa2.DadosCasa();
		casa3.DadosCasa();
		casa4.DadosCasa();
		ap2.DadosCasa();
		ap3.DadosCasa();
	}

}
