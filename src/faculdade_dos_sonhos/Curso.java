package faculdade_dos_sonhos;

public class Curso {
	private String nome_do_curso, area_do_curso, horario;
	private int quant_vagas, quant_periodos;
	private boolean bolsa_pos;
	String separação = "\n----------\n";
	
	public Curso(String nome_do_curso, String area_do_curso, String horario, int quant_vagas, int quant_periodos) {
		this.nome_do_curso=nome_do_curso;
		this.area_do_curso=area_do_curso;
		this.horario=horario;
		this.quant_vagas=quant_vagas;
		this.quant_periodos=quant_periodos;
	}
	
	public String getNome_do_curso() {
		return nome_do_curso;
	}

	public String getArea_do_curso() {
		return area_do_curso;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public int getQuant_vagas() {
		return quant_vagas;
	}
	
	public int getQuant_periodos() {
		return quant_periodos;
	}
	
	public void LiberarBolsa() {
		bolsa_pos = true;
	}
	public void Mostra_Curso() {
		String pos_graduação;
		if (bolsa_pos) {
			pos_graduação = "A turma ganhou uma bolsa de Pós-Graduação!";
		}else {
			pos_graduação = "A turma não ganhou bolsa de Pós-Graduação!";
		}
		System.out.println("Nome do curso: "+nome_do_curso+"\nÁrea do Curso: "+area_do_curso+"\nHorário: "+horario+"\nQuantidade de Vagas: "+quant_vagas+"\nQuantidade de Períodos: "+quant_periodos+"\nAtenção: "+pos_graduação+separação);
		
	}
}
