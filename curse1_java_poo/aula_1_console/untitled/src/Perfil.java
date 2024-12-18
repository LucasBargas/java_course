public class Perfil {
  public static void main(String[] args) {
    String name = "Lucas";
    String surname = "Bargas";

    // Template string similar
    String fullNameVersionOne = String.format("Olá, %s %s!", name, surname);
    String fullNameVersionTrue = "Olá " + name + " " + surname + "!";

    System.out.println(fullNameVersionOne);
    System.out.println(fullNameVersionTrue);
    System.out.println("Tudo bem?");
  }
}