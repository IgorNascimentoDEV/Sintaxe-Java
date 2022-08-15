package excercicio-logica;

import java.util.Scanner; //Import responsavel pela captura dedados do usuario

public class App {
   
    public static void main(String[] args) {

    	/*faça um algoritmo que receba um numero e diga se esta no intervalo entre 100 e 200*/

    	int numero;

    	Scanner leitorScanner = new Scanner(System.in);

    	System.out.println("Por favor digite um número a ser analisado");
    	numero = leitorScanner.nexTInt();

    	if(numero >=100 && numero <=200){
    		System.out.println("Esta entre 100 e 200");
    	}else{
    		System.out.println("O numero não esta entre 100 e 200");
    	}




    	/**Exercicio utilizando estrutura de repetição*/

    	/*Faça um algoritmo que receba "N" números e mostre positivo se o número for positivo, negativo ou zero para cada numero*/

    	char desejaContinuar = 'S';

    	while(desejaContinuar == 'S' || desejaContinuar == 's'){

    		int numeroEx02;

    		System.out.println("Por favor Dijite um número");
    		numeroEx02 = leitorScanner.nextInt();

    		if(numeroEx02 == 0){
    			System.out.println("O numero informado foi zero");
    		}else{
    			if(numeroEx02 > 0){
    				System.out.println("O número informado é maior que zero");
    			}else{
    				System.out.println("O número Informado é menor que zero");
    			}

    			System.out.println("Deseja Continuar ? Digite S-Sim / N-Não");
    			desejaContinuar = leitorScanner.next().charAt(0);
    		}
    	}



    	/*faça um algoritmo que receba o preço de custo e o preço de venda de 3 produtos. Mostre como resultado
    	se houver lucro, prejuizo ou empate para cada produto informe o valor de custo o valor de venda de cada 
    	produto a média de preço de custo e do preço de venda*/


    	String nomeProduto;
    	float precodeCusto;
    	float precodeVenda;


    	float totalCusto = 0.0f;
    	float totalVenda = 0.0f; 

    	int i;

    	for(i = 0; i < 3; i++){

    		nomeProduto = leitorScanner.nextLine();//ESSA LEITURA É NECESSARIA PARA DAR UMA PAUSA NO ALGORITMO
    		System.out.println("Digite o nome do produto");
    		nomeProduto = leitorScanner.nextLine();

    		System.out.println("Digite o valor de preço custo do produto");
    		precodeCusto = leitorScanner.nextFloat();

    		System.out.println("Digite o valor do preço de venda do produto");
    		precodeVenda = leitorScanner.nextFloat();

    		totalCusto = totalCusto + precodeCusto;
    		totalVenda = totalVenda + precodeVenda; 

    		if(precodeCusto == precodeVenda){
    			System.out.println("Houve um empate entre os preço de custo e de venda");
    		}else{
    			if(precodeCusto > precodeVenda){
    				System.out.println("Houve um prejuizo");
    			}else{
    				System.out.println("O preço de Venda Estar correto");
    			}
    		}


    		System.out.println("O produto: " + nomeProduto + " Preço de custo: " + precodeCusto + " Preço de Venda: "
    		 + precodeVenda);
    	}

    	System.out.println("A media do preço de custo é: " + (totalCusto / i));
    	System.out.println("A media do preço de venda é: " + (totalVenda / i));


    }
}