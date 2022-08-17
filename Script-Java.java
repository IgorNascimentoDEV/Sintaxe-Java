
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


        /**Classes

        É uma estrutura que tem como finalidade representar uma entidade real no nosso algoritmo
        Como exemplo de classe vamos criar um novo arquivo para uma pessoa que tem como fim calcular o imc*/
    
        package classes;

        public class pessoa{

            //As classes são  formadas por atributos e métodos

            //Exemplo de Atributo

            float peso;
            float altura;


            //O que é metodo? metodo São as ações que aquela entidade vai fazer dentro do nosso algoritmo

            //Exemplo de Metodo para calcular imc

            public float calcularIMC(){
                float imc = peso / (altura * altura);
                return imc;
            }

        }



        /**Vamos ver agora um exemplo de um algoritmo feito sem a orientação a objetos e um com orientação*/


        //Algoritmo para calcular imc Sem POO

        float peso;
        float altura;
        float imc;


        System.out.println("Por favor digite seu peso");
        peso = leitor.nextFloat();
        System.out.println("Por favor difite sua altura");
        altura = leitor.nextFloat();

        imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);





        //Agora vejamos um com POO

        /*Na POO chamamos a classe e os metodos dentro dela que já criamos otimizando mais o nosso codigo*/

        pessoa = objetoPessoa = new pessoa(); //na POO temos nossas proprias variaveis Essa é a forma correta de declaralas

          System.out.println("Por favor digite seu peso");
          objetoPessoa.peso = leitor.nextFloat();
          System.out.println("Por favor difite sua altura");
          objetoPessoa.altura = leitor.nextFloat();

          System.out.println("IMC: " + pessoa.calcularIMC());//a responsabilidade de calcular o imc fica com o metodo já criado




          /**Principio do Encapsulamento
          Consiste em que os objeto e somente ele seja responsavel por gerenciar suas informações para fins de segurança e para 
          ter acesso a esses atributos devem ser criadas metodos acessores*/


          package classes;

          public class pessoa{

                //As classes são  formadas por atributos e métodos

                //Exemplo de Atributo

                private float peso; // Com o uso do private esses atributos não podem ser acessados de forma globalmente 
                private float altura;


                //Exemplo de Metodo para calcular imc

                public float calcularIMC(){
                    float imc = peso / (altura * altura);
                    return imc;
                }


                //Para acessar os dados do objeto são necessarios criar metodos acessores

                //Metodos acessores

                public void setPeso(float peso){
                    this.peso = peso; //Colocamos o this.peso para informa ao programa que queremos acessar o atributo peso
                }


                //o Get peso é utilizado caso nos precisamos pedir para o usuario o peso
                public float getPeso(){
                    return peso;
                }


                public void setAltura(float altura){
                    this.altura = altura;
                }

                public float getAltura(){
                    return altura;
                }
            }



         /*Com todas essas alterações feitas o Encapsulamento criado vamos agora altera nosso algoritmo de calcular imc*/


         pessoa = objetoPessoa = new pessoa(); 
         System.out.println("Por favor digite seu peso");
         objetoPessoa.setPeso(leitor.nextFloat());//Uma pequena alteração para o metodo de captura de informação
         System.out.println("Por favor difite sua altura");
         objetoPessoa.setAltrura(leitor.nextFloat());

         System.out.println("IMC: " + pessoa.calcularIMC());




         /**Herança
         É utilizada quando temos dentro do nosso sistema classes ou entidades que possuem informações similares
         a ideia da Herança é evitar essa duplicação de codigo*/


         /*Vamos imaginar o cenario de desenvolvimento de um sistema de folha de pagamento de uma empresa vamos
         dar um exemplo de 2 funcionarios um vendedor e um motorista*/

         //Para isso temos que criar uma classe para cada um desses funcionarios


          package Herança;
          //para trabalharmos com variaveis de tipo data no java como ela não é uma variavel primitiva precisamos importala com:

          import java.util.Date;

          public class vendedor{

            private String nome;
            private String cpf;
            private Date dataNascimento;
            private float salario;


            public vendedor(){

            }

            public String getNome(){
                return nome;
            }

            public void setNome(){
                this.nome = nome;
            }


            public String getCpf(){
                return cpf;
            }

            public void setCpf(){
                this.cpf = cpf;
            }


            public Data getDataNascimento(){
                return dataNascimento;
            }

            public void setDataNascimento(){
                this.dataNascimento = dataNascimento;
            }


            public float getSalario(){
                return salario;
            }

            public void setSalario(){
                this.salario = salario;
            }



            //criação classe motorista


            package Herança;
           
             //para trabalharmos com variaveis de tipo data no java como ela não é uma variavel primitiva precisamos importala com:

               import java.util.Date;

            public class motorista{

                private String nome;
                private String cpf;
                private Date dataNascimento;
                private float salario;


                public motorista(){

                }

                public String getNome(){
                    return nome;
                }

                public void setNome(){
                    this.nome = nome;
                }


                public String getCpf(){
                    return cpf;
                }

                public void setCpf(){
                    this.cpf = cpf;
                }


                public Data getDataNascimento(){
                    return dataNascimento;
                }

                public void setDataNascimento(){
                    this.dataNascimento = dataNascimento;
                }


                public float getSalario(){
                    return salario;
                }

                public void setSalario(){
                    this.salario = salario;
                }
            }

            /*Nesse cenario podemos deduzir que tanto o vendedor e o motorista podem ter dados de tipos iguais
            dentro de suas classes com: Nome, cpf, Data de Nascimento. com isso podemos usar a herança para combater 
            duplicações no nosso codigo */

            /*Vamos cria uma classe generica com dados comuns de todos os funcionarios da empresa
            podemos chamar essa classe de Funcionarios*/


             package Herança;
           
             //para trabalharmos com variaveis de tipo data no java como ela não é uma variavel primitiva precisamos importala com:

               import java.util.Date;

            public class funcionarios{
                //dentro dessa classe vamos colocar os dados comuns de todos os funcionarios


                private String nome;
                private String cpf;
                private Date dataNascimento;
                private float salario;


                public vendedor(){

                }

                public String getNome(){
                    return nome;
                }

                public void setNome(){
                    this.nome = nome;
                }


                public String getCpf(){
                    return cpf;
                }

                public void setCpf(){
                    this.cpf = cpf;
                }


                public Data getDataNascimento(){
                    return dataNascimento;
                }

                public void setDataNascimento(){
                    this.dataNascimento = dataNascimento;
                }


                public float getSalario(){
                    return salario;
                }

                public void setSalario(){
                    this.salario = salario;
                }
             }


             /*e podemos fazer a ligação da classe funcionario com as classes vendendor e motorista*/

             package Herança;
           

            public class vendedor extends funcionarios{
                //essa ligação é feita pela propriedade extends e nome da classe que no caso e funcionarios

                /*assim tudo que esta na classe funcionarios passar a ser do vendedor tambem  e o vendedor pode ter
                suas atribuições e metodos proprios*/
            
                private int totalVendas;
                private float totalComissao;

                public vendedor(){
                    //O método Super é responsavel por chamar os metodos e atributos da classe que está ligada ao vendedor
                    super();

                }

                public float calcularSalario(){
                    return super.getSalario() + (this.totalComissao * getTotalVendas);
                }

                public int getTotalVendas(){
                    return totalVendas;
                }

                public void setTotalVendas(){
                    this.totalVendas = totalVendas;
                }


                public float getTotalComissao(){
                    return totalComissao;
                }

                public void setTotalComissao(){
                    this.totalComissao = totalComissao;
                }

            }


            //E iremos fazer as mesmas alterações para o motorista e funcionarios futuros

             package Herança;
           

            public class motorista extends funcionarios{

                public motorista(){

                }
            }




















        

 



    }

}
