import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner reading = new Scanner(System.in);

		System.out.println("Qual o seu filme favorito?");
		String movie = reading.nextLine(); // retorna uma string como resposta

		System.out.println(String.format("Qual o ano de lançamento do filme %s?", movie));
		int year = reading.nextInt(); // retorna um int como resposta

		// Final answer
		String finalAnswer = String.format("O filme %s foi lançado no ano de %s", movie, year);
		System.out.println(finalAnswer);
	}
}
