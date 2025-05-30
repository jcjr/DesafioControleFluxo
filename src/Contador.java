import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro par�metro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo par�metro:");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		terminal.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		int contagem = 0;
		
		if(parametroUm < parametroDois) 
			contagem = parametroDois - parametroUm;
		else
			throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro.");
		
		for(int i=0; i < contagem; i++) {
			System.out.println("Imprimindo o n�mero " + (i+1)); 
		}
	}

}
