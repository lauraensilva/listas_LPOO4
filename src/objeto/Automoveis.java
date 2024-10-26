package objeto;

public class Automoveis {
	String modelo, cor, tipo, categoria, capacidadeString;
	int ano, quantidade_de_pessoas, portas;
	double capacidade_em_toneladas;
	boolean estadoMotor = false;
	
	public void ligaMotor()	{
		estadoMotor = true;
	}
	
	public void desligaMotor() {
		estadoMotor = false;
	}
	public void capacidade() {
		if (capacidade_em_toneladas>0.5) {
			capacidadeString="sim";
		}else {
			capacidadeString="não";
		}
	}
	
	public void informaDados(){
		String motorString;
		if (estadoMotor){
			motorString = " ligado";
		}else{
			motorString = " desligado";
		}
		System.out.println("Automovel: " + modelo + " ano: " + ano + " cor: " + cor + " tipo: "+ tipo +" categoria: "+categoria+" quantidade de pessoas: "
				+ ""+quantidade_de_pessoas+" quantidade de portas: "+portas+" maior que 0,5 tonelada: "+capacidadeString+" estado do motor: "+ motorString);
		estadoMotor = false;
	}
}