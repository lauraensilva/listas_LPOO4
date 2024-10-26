package flores_do_campo;

public class Floricultura {
	
	public static void main(String[]args) {
		Flores rosa = new Flores("rosa", "vermelha", true, true);
		Flores margarida = new Flores("margarida","amarela",true, false);
		Flores cravo = new Flores ("cravo", "branco", false, true);
		Flores peonia = new Flores("Peônia","rosa",true, true);
		Flores girassol = new Flores("Girassol", "amarelo", false, false);
		Flores lirio = new Flores ("Lírio", "Lilás", true, false);
		
		rosa.DadosFlores();
		margarida.DadosFlores();
		cravo.DadosFlores();
		peonia.DadosFlores();
		girassol.DadosFlores();
		lirio.DadosFlores();
	}
}
