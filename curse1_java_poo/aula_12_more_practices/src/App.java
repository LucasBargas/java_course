import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    @SuppressWarnings("resource")
    Scanner reading = new Scanner(System.in);

    // Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
    System.out.println("Digite um número positivo ou negativo:");
    int valueTestOne = reading.nextInt();
    
    // converti o int em string e verifiquei se possui o "-"
    if ((valueTestOne + "").contains("-")) { // ou if (valueTestOne > 0) o que é mais fácil
      System.out.println("Você digitou um número negativo.");
    } else {
      System.out.println("Você digitou um número positivo.");
    }

    // Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
    System.out.println("Digite um primeiro número inteiro:");
    int firstValue = reading.nextInt(); 
    System.out.println("Digite um segundo número inteiro:");
    int secondValue = reading.nextInt();

    if (firstValue == secondValue) {
      System.out.println("Você digitou dois números iguais.");
    } else if (firstValue != secondValue && firstValue > secondValue) {
      System.out.println("Você digitou dois números diferentes e o valor do primeiro é maior que o segundo.");
    } else {
      System.out.println("Você digitou dois números diferentes e o valor do segundo é maior que o primeiro.");
    }

    // Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    int choice = 0;
    
    while (choice != 3) {
      System.out.println("-----Menu-----");
      System.out.println("1. Calcular área do quadrado");
      System.out.println("2. Calcular área do círculo");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      
      choice = reading.nextInt();

      if (choice == 1) {
        System.out.print("Digite o lado do quadrado: ");
        double lado = reading.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.println("Área do quadrado: " + areaQuadrado);
      } else if (choice == 2) {
        System.out.print("Digite o raio do círculo: ");
        double raio = reading.nextDouble();
        double areaCirculo = 3.14 * raio * raio; 
        System.out.println("Área do círculo: " + areaCirculo);
      } else if (choice == 3) {
        System.out.println("Programa encerrado.");
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }
    }

    // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
    System.out.println("Qual tabuada deseja ver?");
    int number = reading.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + (number * i));
    }

    // Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
    
    System.out.println("Digite um número inteiro ou 0 para sair:");
    int aNumber = reading.nextInt();
    
    if (aNumber % 2 == 0) {
      System.out.println("Você digitou um número par.");
    } else {
      System.out.println("Você digitou um número ímpar.");
    }

    // Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
    System.out.println("Digite um número:");
    int numb = reading.nextInt();
    int fatorial = 1;

    for (int i = 1; i <= numb; i++) {
      fatorial *= i;
    }

    System.out.println(fatorial);
  }
}
