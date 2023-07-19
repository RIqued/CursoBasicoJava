import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner numeroAdd = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);



        int tentativas = 1;
        int numero = 0;

        while (tentativas <5){
            System.out.println("Digite um numero de 1 a 100  ");
            numero = numeroAdd.nextInt();
            tentativas++;

            if (numero == numeroAleatorio){
                System.out.println("você acertou");

                break;
            }else if (numero > numeroAleatorio){
                System.out.println("O numero é menor");


            }else System.out.println("O numero é maior");
            }
            if (tentativas == 5){
                System.out.println("Voce é um merda e n conseguiu em 5 tentativas!!!");
            }
        }
    }

