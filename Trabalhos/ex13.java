import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            n = sc.nextInt();

            if (n == 0) break;

            if (n < 1 || n > 99) {
                System.out.println("Número inválido, digite entre 1 e 99.");
            } else if (n % 2 != 0) {
                System.out.println("Número ímpar. Não somado.");
            } else {
                System.out.println("Número par somado.");
                soma += n;
            }

        } while (true);

        System.out.println("Soma final dos pares: " + soma);
        sc.close();
    }
}
