import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // Jogo de adivinhação
    @SuppressWarnings("resource")
    Scanner reading = new Scanner(System.in);
    int randomNumber = new Random().nextInt(100); // Números aleatórios entre 0 e 100
    int tentativas = 0;
    int numeroDigitado = 0;

    System.out.println("Está preparado para jogar?");
    String isPrepare = reading.nextLine();

    if (!isPrepare.equals("Não")) {
      while (tentativas < 5) {
        System.out.println("Digite um número entre 0 e 100:");
        numeroDigitado = reading.nextInt();
        tentativas++;
  
        if (numeroDigitado == randomNumber) {
          System.out.println(String.format("Parabéns, você acertou o número em %s tentativas!", tentativas));
          break; // loop stop
        } else if (numeroDigitado < randomNumber) {
          System.out.println("O número digitado é menor do que o número gerado.");
        } else {
          System.out.println("O número digitado é maior do que o número gerado.");
        }
      }
  
      if (tentativas == 5 && numeroDigitado != randomNumber) {
        System.out.println("Você não conseguiu acertar o número em 5 tentativas.");
      }
    } else {
      System.out.println("Te aguardarmos em outro momento!");
    }
  }
}
