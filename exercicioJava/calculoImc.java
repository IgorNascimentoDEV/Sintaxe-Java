import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String nome;
    float peso = 0f;
    float altura = 0f;
    float imc = 0f;

    System.out.println("Por favor digite seu nome");
    nome = leitor.nextLine();
    System.out.println("Digite a altura");
    altura = leitor.nextFloat();
    System.out.println("Digite a peso");
    peso = leitor.nextFloat();

    imc = peso / (altura*altura);

    System.out.println("Olá "+ nome + " O resultado do seu imc é: "+imc);
  }
}