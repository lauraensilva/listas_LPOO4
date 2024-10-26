package flores_do_campo;

public class Flores {
	private String tipo, cor;
	private boolean perfume, espinho;
	String separação = "\n----------\n";
	
	public Flores(String tipo, String cor, boolean perfume, boolean espinho) {
		this.tipo=tipo;
		this.cor=cor;
		this.perfume=perfume;
		this.espinho=espinho;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getPerfume() {
		if (perfume) {
			return "Sim";
		}else {
			return "Não";
		}
		
	}
	
	public String getEspinho() {
		if (espinho) {
			return "Sim";
		}else {
			return "Não";
		}
	}
	
	public void DadosFlores() {
		System.out.println("Tipo: "+tipo+"\nCor: "+cor+"\nTem perfume:: "+perfume+"\nTem espinho: "+espinho+separação);
	}
}
