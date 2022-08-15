
package Script-Java;

import java.util.Scanner;

import java.util.Scanner; //Import responsavel pela captura dedados do usuario

public class App {
   
    public static void main(String[] args) {
    	
    	/*Criação do leitor para captura dados*/
        Scanner leitor = new Scanner(System.in);
        
        
        //Leitura de dados
        
        int exemploInteiro = leitor.nextInt();
        float exemploFloat = leitor.nextFloat();
        double ecemploDouble = leitor.nextDouble();
        
        String exemploTexto = leitor.nextLine();
        String exemploPalavra = leitor.next();
        char exemploUnicoCaracter = leitor.next().charAt(0);
    


        /**Estrutura Condicional*/

        int exemplo = 10;

        if(exemplo >=7){

            System.out.println("passou");

        }else{

            System.out.println("não passou");

        }


        //Estrutura escolha

        int codigoDeControle = 2;

        switch(codigoDeControle){
            case 1:
                //Escopo do codigo
                break;

            case 2:
                //Escopo do codigo
                break;

            default: //caso nenhuma opção for atendida 
                //Escopo do default
        }



        //Estruturas de reptição

        for(int i = 0; i <= 10; i++){

        }


        //exemplo estrutura while


        int alunos = 10;

        while(alunos > 0){

            System.out.println(alunos + "restantes em aula");

            alunos = alunos - 1;

        }
    }
}
