import java.util.Scanner;
public class ex6 {
    public static int processamento(int num1, int num2, String simbolo) {
        switch(simbolo){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("Simbolo inválido! Digite + - * /.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = calculo.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = calculo.nextInt();
        System.out.println("Digite o simbolo lógico:");
        String simbolo = calculo.next();
        System.out.println(processamento(num1, num2, simbolo));
    }
}