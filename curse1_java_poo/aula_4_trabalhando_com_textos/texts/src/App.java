public class App {
  public static void main(String[] args) throws Exception {
    int year = 2022;
    // Option 1 to declare a text;
    String sinopseOne;
    sinopseOne = "Filme de aventura com galã dos anos 80";
    System.out.println(sinopseOne);

    // Option 2 to declare a text;
    String sinopseTwo;
    sinopseTwo = String.format("""
      Filme de aventura com galã dos anos 80, muito bem avaliado.
      Lançado no ano de %s.         
    """, year);

    System.out.println(sinopseTwo);
  }
}
