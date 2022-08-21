package excercicio-logica;

import java.util.Scanner; //Import responsavel pela captura de dados do usuario

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





    	/*A concessionaria de veiculos "CARANGO VELHO" está vedendo seus veiculos com desconto. faça um algoritmo que 
    	calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto devera de ser calculado
    	de acordo com o ano do veiculo até 2000 -12% e cima de 2000 -7%. O sistema deverá perguntar se deseja continuar calculando
    	desconto até que a reesposta seja (N)não. Informar total de carros com ano até 2000 e total geral*/


    	int anoFabricado = 0;
    	float valorVeiculo = 0;

    	float porcentagemDesc = 0.0f;
    	float valorDesc = 0.0f;
    	float valorPagar = 0.0f;

    	char desejaContinuar = 'S';

    	int totalCarros = 0;
    	int totalCarrosSemiNovos = 0;


    	while(desejaContinuar == 'S' || desejaContinuar == 's'){

    		System.out.println("Por favor digite o ano do Veiculo");
    		anoFabricado = leitorScanner.nextInt();
    		System.out.println("Por Gentileza digite o valor do automovel");
    		valorVeiculo = leitorScanner.nextFloat();

    		if(anoFabricado < 2000){
    			porcentagemDesc = 0.12f;
    		}else if(anoFabricado >= 2000){
    			porcentagemDesc = 0.07f;
    			totalCarrosSemiNovos++;
    		}

    		valorDesc = valorVeiculo * porcentagemDesc;
    		valorPagar = valorVeiculo - valorDesc;

    		totalCarros++;

    		System.out.println("O valor do carro é: " + valorVeiculo);
    		System.out.println("O valor do Desconto é: " + valorDesc);
    		System.out.println("O valor Final é: " + valorPagar);

    		System.out.println("Desaja continuar S-Sim / N-Não");
    		desejaContinuar = leitorScanner.next().charAt(0);

    		if(desejaContinuar == 'N' || desejaContinuar == 'n'){
    			System.out.println("O total de carros Semi novos são: " + totalCarrosSemiNovos);
    			System.out.println("O total de carros é: " + totalCarros);
    		}

    	}




    	/*Crie uma classe chamada invoice que possa ser utilizadopor uma loja de suprimentos de informática
    	para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
    	como atributos:
    	a. o número de itens faturados
    	b. a descrição do item
    	c. a quantidade comprada do item
    	d. o preço unitario do item
    	Sua classe deve ter um construtor que inicialize os quatros atributos se a quantidade não for positiva, ela deve ser 
    	configurada como 0, se o preço do iten não for positivo ele deve ser configurado com 0.0 Forneça um método set
    	e um get para cada variável  de instância.
    	Além disso, forneça um método chamado getlnvoiceAmount que calcule o valor da fatura (isso é multiplica 
    	a quantidade pelo preço do item) e depois retorna um valor como um double . Escreva um aplicativo de teste
    	que demonstra as capacidades da classe Invoice*/



    	//Criando classe Invoice

    	public class invoice{

    		public int codigoProduto;
    		public String descricaoProduto;
    		public int qtdComprada;
    		public float precoProduto;


    		public invoice(int codigoProduto,  String descricaoProduto, int quantidadeComprada, float precoProduto){

    			this.setCodigoProduto(codigoProduto);
    			this.setDescricaoProduto(descricaoProduto);

    			this.setQtdComprada(qtdComprada);
    			this.setPrecoProduto(precoProduto);
    			
    		}


    		public double getlnvoiceAmount(){
    			return qtdComprada * precoProduto;
    		}


    		public getCodigoProduto(){
    			return codigoProduto;
    		}

    		public setCodigoProduto(int codigoProduto){
    			this.codigoProduto = codigoProduto;
    		}

    		public getDescricaoProduto(){
    			return descricaoProduto;
    		}

    		public setDescricaoProduto(String descricaoProduto){
    			this.descricaoProduto = descricaoProduto;
    		}

    		public getQtdComprada(){
    			return qtdComprada;
    		}

    		public setQtdComprada(int qtdComprada){

    			if(quantidadeComprada < 0){
    				this.quantidadeComprada = 0
    			}else{
    				this.qtdComprada = quantidadeComprada;
    			}

    		}

    		public getPrecoProduto(){
    			return precoProduto;
    		}

    		public setPrecoProduto(float precoProduto){
    			if(precoProduto < 0){

    				this.precoProduto = 0;
    			}else{
    				this.precoProduto = precoProduto;
    			}
    		}


    	}

    		/*Parte MAIN*/

			class Main {

 			 public static void main(String[] args) {
    
    			invoice inv = new invoice(1, "pirulito", 10, 10.0f);
    			System.out.println("O valor total do produto é" + inv.getlnvoiceAmount());
   		 
  			 
  			 }
			
			}




			/*percorrendo um array no java com o uso do for*/

			String familia [] = {"IGOR", "ISABELE", "MARIA ISADORA"};


			for(int x = 0; x < familia.length; x++ ){
				System.out.println("O integrante da familia de igor são na posição " + x + familia[x]);
			}
























    }
}