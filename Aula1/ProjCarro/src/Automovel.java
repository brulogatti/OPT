
public class Automovel {
	
	private int id;
	private String nome;
	private int anoFabricacao;
	private int anoModelo;
	private String cor;
	private Motor motor;
	
	public Automovel(int id, String nome, int anoFabricacao, int anoModelo, String cor, Motor motor) {
		this.id=id;
		this.nome=nome;
		this.anoFabricacao=anoFabricacao;
		this.anoModelo=anoModelo;
		this.cor=cor;
		this.motor=motor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String imprimir() {
		return "\nAutomóvel: \nID: " + id + "\nNome: " + nome + "\nAno Fabricação: " + anoFabricacao + "\nAno Modelo: "
				+ anoModelo + "\nCor: " + cor + "\nMotor: " + motor;
	}
	
	

}
