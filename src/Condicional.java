public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoDoPlano = "plus";
        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoDoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a Locação");
        }
    }
}
