package minha_casa_minha_vida;

public class Casa {
	private int inscrição;
	private String cidade, tipo_de_residencia;
	String separação = "\n----------\n";
	
	public Casa(int inscrição,String cidade, String tipo_de_residencia) {
		this.inscrição=inscrição;
		this.cidade=cidade;
		this.tipo_de_residencia=tipo_de_residencia;
	}
	
	public int getInscrição() {
		return inscrição;
	}
	public String getCidade() {
		return cidade;
	}
	public String getTipo_de_residencia() {
		return tipo_de_residencia;
	}
	
	public void DadosCasa() {
		System.out.println("Inscrição: "+inscrição+"\nCidade: "+cidade+"\nTipo de Residência: "+tipo_de_residencia+separação);
	}

}
