public class Carro extends Automovel{

	private Fabricante fabricante;
	
	public Carro(int id, String nome, int anoFabricacao, int anoModelo, String cor, Motor motor, Fabricante fabricante) {
		super(id, nome, anoFabricacao, anoModelo, cor, motor);
		this.fabricante=fabricante;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public String imprimiFornecedor() {
		return "Nome do Fornecedor" + this.fabricante;
	}


	public String imprimirCarro() {
		return "Carro: \nFabricante: " + fabricante + imprimir();
	}
	
	
	
	
}
