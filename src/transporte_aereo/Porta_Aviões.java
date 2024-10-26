package transporte_aereo;

public class Porta_Aviões {
	public Porta_Aviões() {
		
	}
	public static void main(String [] args) {
		Aviao helicoptero = new Aviao();
		Aviao carga_sólida = new Aviao();
		Aviao abastecimento_de_combustivel = new Aviao();
		Aviao caça = new Aviao();
		Aviao reconhecimento = new Aviao();
		
		helicoptero.modelo="Helicoptero";
		helicoptero.helice="sim";
		helicoptero.planar="sim";
		
		carga_sólida.modelo="Carga Sólida";
		carga_sólida.helice="sim";
		carga_sólida.planar="sim";
		
		abastecimento_de_combustivel.modelo="Abastecimento de Combustível";
		abastecimento_de_combustivel.helice="sim";
		abastecimento_de_combustivel.planar="sim";
		
		caça.modelo="Caça";
		caça.helice="Sim";
		caça.planar="Sim";
		
		reconhecimento.modelo="Avião de Reconhecimento";
		reconhecimento.helice="sim";
		reconhecimento.planar="sim";
		
		helicoptero.EstaNoAr();
		caça.EstaNoAr();
		
		helicoptero.DadosAviao();
		carga_sólida.DadosAviao();
		abastecimento_de_combustivel.DadosAviao();
		caça.DadosAviao();
		reconhecimento.DadosAviao();		
	}
}
