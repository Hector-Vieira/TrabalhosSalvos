import java.sql.SQLOutput;
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para começar e 1000 para parar");
        int start = sc.nextInt();
        int aleatorio = (int)(Math.random()*100);

        if (start == 1){
            do {
                System.out.println("Digite um número: ");
                int n = sc.nextInt();
                if (n == 1000){
                    System.out.println("Finalizando... \n O número era: " + aleatorio);
                    break;
                } else if (n > aleatorio){
                    System.out.println("O número é menor.");
                } else if (n < aleatorio){
                    System.out.println("O número é maior.");
                } else {
                    System.out.println("Você acertou! \nO número escolhido foi: " + aleatorio);
                    break;
                }

            } while (true);
        }

    }
}
