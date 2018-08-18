
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo!");
		
		Funcionario f = new Funcionario(1,"Bruna",23,1275);
		
		/*f.setCodigo(1);
		f.setIdade(23);
		f.setNome("Bruna");
		f.setSalario(1275);*/
		
		Imprimir(f.imprimir());
		Imprimir(String.valueOf(f.bonificaFuncionario()));
		Imprimir(f.verificaMaiorIdade());
		Imprimir(f.verificaMelhorIdade());
	}
	
	public static void Imprimir(String txt) {
		System.out.println(txt);
	}

}
