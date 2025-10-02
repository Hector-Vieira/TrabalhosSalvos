import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exercicio = 1;
        do {
            System.out.println("Digite qual exercício você deseja consultar (11, 12, 13, 14 ou 15) 0 PARA SAIR: ");
            exercicio = sc.nextInt();
            switch (exercicio) {
                case 11:
                    System.out.println(ex11(exercicio));
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                default:
                    if(exercicio != 0){
                        System.out.println("Exercício inexistente.\n");
                    }
            }
        }while(exercicio != 0);

    }

    public static String ex11 (int exercicio){
        Scanner dados = new Scanner(System.in);
        int sorteio = 0;
        int digitado = 0;
            do{
                do{
                    System.out.println("Digite um número de 10 a 29 -- 9 PARA ENCERRAR: ");
                    digitado = dados.nextInt();
                    System.out.println("");
                    if(digitado == 9 ){
                        break;
                    } else if (digitado > 29 || digitado < 10){
                        System.out.println("Número invalido.");
                        break;
                    }

                    Random random = new Random();
                    sorteio = 10 + random.nextInt(20);

                    if(sorteio != digitado){
                        System.out.println("Você não foi sorteado, tente novamente.");
                    }
                }while(digitado != sorteio);
                if (digitado == sorteio){
                    System.out.println("\nVOCÊ ACERTOOOOOOOOOOOOOOOOOOOOOOUUUUUUUU, PARABÉNSS!!!");
                }
            } while (digitado != 9);
            dados.close();
            return "O valor era " + sorteio + "\nEncerrando...";
    }
    public static String ex12 (int exercicio){
        Scanner dados = new Scanner(System.in);
        ArrayList banco = new ArrayList();
        System.out.println("Digite o primeiro número: ");
        int primeiro = dados.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundo = dados.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terceiro = dados.nextInt();

        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        for (int i = menor; i > )
    }
}