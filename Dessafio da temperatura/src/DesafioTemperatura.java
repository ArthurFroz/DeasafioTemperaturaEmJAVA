
public class DesafioTemperatura {
    public static void main(String[] args) {
        System.out.printf("Celsius para Fahrenheit");

        double temperaturaEmCelcius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelcius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelcius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}