package spa_dos_pets;

public class Canil {
	public Canil() {
		
	}
	public static void main(String [] args) {
		Cachorro golden = new Cachorro();
		Cachorro poodle = new Cachorro();
		Cachorro pinsher = new Cachorro();
		Cachorro salsicha = new Cachorro();
		Cachorro pitbull = new Cachorro();
		golden.nome="Dourado";
		golden.raça="Golden";
		golden.cor="Amarelo";
		golden.tamanho="50cm";
		poodle.nome="Segredo";
		poodle.raça="Poodle";
		poodle.cor="Branco";
		poodle.tamanho="30cm";
		pinsher.nome="DEstruidor";
		pinsher.raça="Pinsher";
		pinsher.cor="Amarelo-queimado";
		pinsher.tamanho="10cm";
		salsicha.nome="HotDog";
		salsicha.raça="Salsicha";
		salsicha.cor="caramelo";
		salsicha.tamanho="20cm";
		pitbull.nome="Docinho";
		pitbull.raça="Pitbull";
		pitbull.cor="Preto";
		pitbull.tamanho="80cm";
		
		pinsher.CachorroLate();
		salsicha.CachorroLate();
		poodle.CachorroLate();
		
		golden.DadosPet();
		poodle.DadosPet();
		salsicha.DadosPet();
		pinsher.DadosPet();
		pitbull.DadosPet();
	}
}
