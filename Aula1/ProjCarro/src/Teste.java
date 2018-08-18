import java.util.ArrayList;

public class Teste {
	
	public static void main (String[]args) {
		
		ArrayList <Carro> carro = new ArrayList <Carro> ();		
		
		carro.add(new Carro(1,"Etios",2013,2014,"Preto",new Motor(1,"Motor XS",98), new Fabricante(1,"Toyota","3333-0000")));
		carro.add(new Carro(2,"Astra",2000,2001,"Prata",new Motor(45,"Motor 2000",220), new Fabricante(2,"Chevrolet","3333-2222")));
		carro.add(new Carro(3,"Jetta",2010,2010,"Branco",new Motor(12,"Motor Turbo",250), new Fabricante(5,"Volkswagen","3333-5511")));
		carro.add(new Carro(4,"Corolla",2018,2018,"Preto",new Motor(2,"Motor 200",210), new Fabricante(1,"Toyota","3333-0000")));
		carro.add(new Carro(5,"Uno",2017,2017,"Vermelho",new Motor(60,"Motor T",115), new Fabricante(3,"Fiat","3223-4545")));
		
			for (Carro carro2 : carro) {
				System.out.println("===========Informações sobre o Carro===========");
				System.out.println(carro2.imprimirCarro());

			}
		}

}
