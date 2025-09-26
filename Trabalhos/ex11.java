import java.util.Scanner;

public class ex11 {
    public static String processamento (int num1, int num2){
        String resultado = "";
        if(num1 < num2){
            for (int i = num2-1; i > num1; i--){
                resultado = resultado += i + "\n";
            }
        }
        else {
            resultado = "Primeiro número é maior que o segundo.";
        }
        return "O resultado é: \n" + resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        System.out.println(processamento(num1, num2));
        sc.close();
    }
}
