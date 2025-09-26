import java.util.Scanner;
public class ex16 {
    public static int processamento (){
        int soma = 0;
        for (int i = 3; i < 100; i += 3){
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("O resultado é: " + processamento());
    }
}
