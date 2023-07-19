public class Temperatura {

    public static void main(String[] args) {
        double temperaturaCelcius = 21;
        double temperaturaFahrenheit = (int) (temperaturaCelcius * 1.8) + 32;

       String tempCelcius = "A temperatura em graus Celcius é de " + temperaturaCelcius;
       String tempFahrenheit = "Já a temperatura em Fahrenheit é de " + temperaturaFahrenheit;
        System.out.println(tempCelcius );
        System.out.println(tempFahrenheit);
    }
}
