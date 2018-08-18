
public class Funcionario extends Pessoa{

	//Atributos
	private double salario;

	//Construtor
	/*public Funcionario(int cod, String nome, int idade, double salario) {
		super(cod, nome, idade);
		this.salario=salario;
	}*/
	public Funcionario(int cod, String nome, int idade, double salario) {
		this.setCodigo(cod);;
		this.setNome(nome);
		this.setIdade(idade);
		this.salario=salario;
	}
	
	//Propriedades
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos
	public double bonificaFuncionario() {
		return this.salario*1.1;
	}
	
	
	public String imprimir() {
		return "ID: " + super.getCodigo() + "\nNome: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSalário: " + this.getSalario();
	}

	@Override
	public String verificaMelhorIdade() {
		if (this.getIdade()>=65) {
			return "Está na melhor idade";
		}
		else
		return "Não está na melhor idade";
	}
}
