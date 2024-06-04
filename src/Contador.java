import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();

        try {
		
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	
		}
    }
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
        if (parametroUm>=parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		
		int contagem = parametroDois - parametroUm;
		for(int contando=1; contando <= contagem;contando++){
            System.out.println("contando"+contando);
        }
	}
    
}
		
  

