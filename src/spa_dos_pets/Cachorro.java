package spa_dos_pets;

public class Cachorro {
	String nome, raça, cor, tamanho;
	boolean latido;
	
	public void CachorroLate() {
		latido = true;
	}
	
	
	String separação = "\n----------\n";
	
	public void DadosPet() {
		String latidoString;
		if (latido) {
			latidoString = "Cachorro Late";
		}else {
			latidoString = "Cachorro Quieto";
		}
		System.out.println("Nome: "+nome+"\nRaça: "+raça+"\nCor: "+cor+"\nTamanho: "+tamanho+"\n"+latidoString+separação);
	}
}
