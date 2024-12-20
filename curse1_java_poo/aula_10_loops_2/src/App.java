import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    @SuppressWarnings("resource")
    Scanner reading = new Scanner(System.in);
    double media = 0;
    double avaliation = 0;
    int avaliationTotal = 0;

    // for (int i = 0; i < 3; i++) {
    //   System.out.println("Diga sua avaliação para o filme:");
    //   avaliation = reading.nextDouble();
    //   media += avaliation;
    // }

    while (avaliation != -1) {
      System.out.println("Diga sua avaliação para o filme ou -1 para encerrar:");
      avaliation = reading.nextDouble();

      if (avaliation != -1) {
        media += avaliation;
        avaliationTotal++;
      }
    }

    System.out.println("Média de avaliações " + (media / avaliationTotal));
  }
}