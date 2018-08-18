
public class Motor {
	
	private int id;
	private String descricao;
	private int qtdCavalos;
	
	public Motor(int id, String descricao, int qtdCavalos) {
		this.id=id;
		this.descricao=descricao;
		this.qtdCavalos=qtdCavalos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdCavalos() {
		return qtdCavalos;
	}
	public void setQtdCavalos(int qtdCavalos) {
		this.qtdCavalos = qtdCavalos;
	}
	
	
	public String forcaMotor() {
		if(this.qtdCavalos>90) {
			return "Esse carro é forte!";
		}else
		return "Esse carro é 1.0!";
	}

	@Override
	public String toString() {
		return "\nId: " + id + "\nDescrição: " + descricao + "\nQuantidade de Cavalos: " + qtdCavalos;
	}
	
	
	
	

}
