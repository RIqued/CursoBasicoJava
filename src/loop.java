import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //entrada de dados
        Scanner leitura = new Scanner(System.in);
        //variaveis
        double media = 0;
        double nota = 0;
        //laco for
        for (int i = 0; i < 3; i++ ) {
            System.out.println("diga sua avaliacao para o filme");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Media de avaliacoes: " + media/3);



    }
}
