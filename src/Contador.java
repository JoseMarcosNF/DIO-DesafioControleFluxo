
import java.util.Scanner;

public class Contador{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        imprimir("Insira o primeiro número: ");
        int numero1 = entrada.nextInt();
        
        imprimir("Insira o segundo número: ");
        int numero2 = entrada.nextInt();
        

        try {
			//chamando o método contendo a lógica de contagem
			contar(numero1, numero2);
		
		}catch (Exception e) {
			imprimir("O segundo parâmetro deve ser maior que o primeiro!");
		}

    
	}
            

    static void imprimir(String informacao){
    //metodo para reduzir o comando de impressão do Java
            System.out.println(informacao);

    } 

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
        if(parametroUm > parametroDois){
        //Se o primeiro parametro for maior que o segundo, cai na exception
            throw new ParametrosInvalidosException();

        }else{

            int contagem = parametroDois - parametroUm;

            for (int cont = 1; cont <= contagem; cont++){

                imprimir ("Imprimindo o número "+cont);

            }
            
        }

	}

}