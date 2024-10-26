package transporte_aereo;

public class Aviao {
	String modelo, helice, planar;
	boolean voando;
	
	public void EstaNoAr() {
		voando = true;
	}
	String separação = "\n----------\n";
	public void DadosAviao() {
		String voandoString;
		if (voando) {
			voandoString = modelo+" está Voando";
		}else {
			voandoString = modelo+" não está Voando";
		}
		System.out.println("Modelo: "+modelo+"\nPossui hélice: "+helice+"\nPlana: "+planar+"\n"+voandoString+separação);
	}
}

