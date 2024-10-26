package cidade;

public class Moradia {
	private String tipo_de_moradia;
	private int quant_comodos;
	String separação = "\n----------\n";
	
	public Moradia(String tipo_de_moradia,int quant_comodos) {
		this.tipo_de_moradia=tipo_de_moradia;
		this.quant_comodos=quant_comodos;
	}
	public String getTipo_de_moradia() {
		return tipo_de_moradia;
	}
	public void setTipo_de_moradia(String tipo_de_moradia) {
		this.tipo_de_moradia = tipo_de_moradia;
	}
	public int getQuant_comodos() {
		return quant_comodos;
	}
	public void setQuant_comodos(int quant_comodos) {
		this.quant_comodos = quant_comodos;
	}
	public void DadosCasa() {
		System.out.println("Tipo de moradia: "+tipo_de_moradia+"\nQuantidade de Cômodos: "+quant_comodos+separação);
	}

}
