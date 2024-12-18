public class Perfil {
  public static void main(String[] args) {
    String name = "Lucas";
    String surname = "Bargas";

    // Template string similar
    String fullName = String.format("Olá, %s %s!", name, surname);

    System.out.println(fullName);
    System.out.println("Tudo bem?");
  }
}