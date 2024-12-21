public class App {
  public static void main(String[] args) throws Exception {
    // Conversão de temperatura em Fahrenheit
    int temperature = 29;
    double fahrenheit = (temperature * 1.8) + 32; // or: int fahrenheit = (int) (temperature * 1.8) + 32;
    int fahrenheitInteger = (int) fahrenheit;
    System.out.println(fahrenheitInteger);

    // Média de duas notas decimais
    double media = (7.54 + 8.32) / 2;
    int result = (int) media;
  
    System.out.println(result);

    // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem
    char letter = 'l';
    String name = "Lucas";
    String message = String.format("O nome %s começa com a letra %s", name, letter);
    System.out.println(message);

    // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem
    double productPrice = 22.5;
    int amount = 40;
    int total = (int) productPrice * amount; 
    System.out.println(total);

    // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado
    double dolarValue = 29.64; 
    double realValue = dolarValue * 4.94;
    System.out.println(realValue);

    // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
    double originalPrice = 320.50;
    double discountPercentage = 10;
    double priceDiscounted = (discountPercentage / 100) * originalPrice;
    double newPrice = originalPrice - priceDiscounted;
    System.out.println(newPrice);
  } 
}
