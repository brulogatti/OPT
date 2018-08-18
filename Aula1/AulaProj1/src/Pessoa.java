
public abstract class Pessoa implements IPessoa {

	//Atributos
	private int codigo;
	private String nome;
	private int idade;
	
	//Propriedades
	/*public Pessoa(int cod, String nome, int idade) {
		this.idade=idade;
		this.codigo=cod;
		this.nome=nome;
	}*/
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Métodos
	public String verificaMaiorIdade() {
		if (this.idade>=18) {
			return "Maior de idade";
		}
		else
		return "Menor de idade";
	}
	
	
	
}
