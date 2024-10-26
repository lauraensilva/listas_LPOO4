package faculdade_dos_sonhos;

public class Universidade {
	public static void main(String []args) {
		Curso farmacia = new Curso ("Farmácia","Humanas","Matutino",200,10);
		Curso direito = new Curso ("Direito","Humanas","Matutino",200,10);
		Curso estatística = new Curso("Estatística","Exatas","Noturno",50,8);
		
		estatística.LiberarBolsa();
		
		farmacia.Mostra_Curso();
		direito.Mostra_Curso();
		estatística.Mostra_Curso();
	}

}
