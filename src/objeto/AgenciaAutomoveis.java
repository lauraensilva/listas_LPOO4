package objeto;

public class AgenciaAutomoveis {
	public AgenciaAutomoveis() {
		
	}
public static void main (String args[]) {
	//Criando os obj.(instancias) da classe automovel
	Automoveis fusca=new Automoveis();//new cria o objeto fusca
	Automoveis gol=new Automoveis(); //objeto gol
	Automoveis monza=new Automoveis(); //objeto monza
	Automoveis montana=new Automoveis(); //objeto montana
	fusca.modelo=" Fusca ";
	fusca.cor=" Preto ";
	fusca.ano=1977;
	fusca.tipo=" Luxo ";
	fusca.categoria = "Passeio";
	fusca.quantidade_de_pessoas = 5;
	fusca.capacidade_em_toneladas = 0.5;
	fusca.portas = 2;
	gol.modelo=" Gol ";
	gol.cor=" Prata ";
	gol.ano=2001;
	gol.tipo=" Simples ";
	gol.categoria = "Passeio";
	gol.quantidade_de_pessoas = 5;
	gol.capacidade_em_toneladas = 0.5;
	gol.portas = 4;
	monza.modelo=" Monza ";
	monza.cor=" Vermelho ";
	monza.ano=1994;
	monza.tipo=" Simples ";
	monza.categoria = "Passeio";
	monza.quantidade_de_pessoas = 5;
	monza.capacidade_em_toneladas = 0.5;
	monza.portas = 2;
	montana.modelo=" Montana ";
	montana.cor=" Azul ";
	montana.ano=2004;
	montana.tipo=" Luxo ";
	montana.categoria = "Montana";
	montana.quantidade_de_pessoas = 5;
	montana.capacidade_em_toneladas = 0.5;
	montana.portas = 2;
	//ligando os motores dos automoveis
	fusca.desligaMotor();
	gol.ligaMotor();
	monza.desligaMotor();
	montana.ligaMotor();
	//mostrando informacoes dos automoveis
	fusca.informaDados();
	gol.informaDados();
	monza.informaDados();
	montana.informaDados();
	}
}
