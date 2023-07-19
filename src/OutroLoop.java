import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        //entrada de dados
        Scanner leitura = new Scanner(System.in);
        //variaveis
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;


        //laco While
        while (nota != -1) {
            System.out.println("diga sua avaliacao para o filme ou -1 para encerar");
            nota = leitura.nextDouble();

            if (nota != -1){
            media += nota;
            //A cada nova dota inserida ela será somada ao valor anterior
            totalDeNotas++;
        }

        System.out.println("Media de avaliacoes: " + media / totalDeNotas);

    }
}
}