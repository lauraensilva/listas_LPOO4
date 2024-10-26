package humanos;

public class Pessoas {
	private String nome, sexo, cor_do_cabelo, raça, nacionalidade;
	private int idade;
	String separação = "\n----------\n";
	
	public Pessoas(String nome, String sexo, String cor_do_cabelo, String raça, String nacionalidade, int idade) {
		this.nome=nome;
		this.sexo=sexo;
		this.cor_do_cabelo=cor_do_cabelo;
		this.raça=raça;
		this.nacionalidade=nacionalidade;
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}
	public String getCor_do_cabelo() {
		return cor_do_cabelo;
	}
	public String getRaça() {
		return raça;
	}
	public int getIdade() {
		return idade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void DadosPessoas() {
		System.out.println("Nome: "+nome+"\nSexo: "+sexo+"\nCor do Cabelo: "+cor_do_cabelo+"\nRaça: "+raça+"\nNacionalidade: "+nacionalidade+"\nIdade: "+idade+separação);
	}


}
