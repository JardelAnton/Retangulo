import java.util.Scanner;
class Retangulo{
	public int height;
	public int width;

	public void area(){	
		System.out.println("Area = "+this.width*this.height);
	}
	public void perimetro(){
		System.out.println("Perimetro = "+((2*this.width)+(2*this.height)));
		/*
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("O nome digitado foi: " + nome);*/
	}
}