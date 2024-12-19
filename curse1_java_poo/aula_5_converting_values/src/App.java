public class App {
  public static void main(String[] args) throws Exception {
    double media = 8.7777;

    // Converter um tipo double em int - casting
    int movieClassification = (int) media / 2;
    System.out.println(movieClassification);

    int age = 24;
    double other = (double) age;
    System.out.println(other);

    // Conversão de temperatura em Fahrenheit
    int temperature = 29;
    double fahrenheit = (temperature * 1.8) + 32; // or: int fahrenheit = (int) (temperature * 1.8) + 32;

    int fahrenheitInteger = (int) fahrenheit;

    System.out.println(fahrenheitInteger);
  }
}
