public class App {
  public static void main(String[] args) {
    int yearOfRelease = 2024;
    boolean planIncluded = true;
    double filmNote = 8.1;
    String planType = "plus";

    // if/else
    if (yearOfRelease >= 2024) {
      System.out.println("Lançamento muito curtido!");
    } else {
      System.out.println("Filme antigo que vale a pena");
    }

    if (planIncluded || planType.equals("plus")) {
      System.out.println("Filme liberado");
    } else {
      System.out.println("Deve pagar a locação!");
    }

    // Switch
    switch ((int) filmNote) {
      case 9:
        System.out.println("Filme bom");
        break;
      case 10:
        System.out.println("Filme excelente");
        break;
      default:
        System.out.println("Filme médio");
        break;
    }
  }
}
