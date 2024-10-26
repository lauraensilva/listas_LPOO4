package minha_casa_minha_vida;

public class Moradia {
	public static void main(String []args) {
		Casa casa = new Casa(123,"Goiânia-GO","Casa");
		Casa apartamento = new Casa(456,"Ap. de Gyn","Apartamento");
		Casa kitnet = new Casa(789,"Senador Canedo","KitNet");
		
		
		casa.DadosCasa();
		apartamento.DadosCasa();
		kitnet.DadosCasa();		
	}
}
