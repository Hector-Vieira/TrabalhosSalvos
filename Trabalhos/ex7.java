import java.util.Scanner;
public class ex7 {
    public static String processamento (int mes, int mesAtual){
        String resultado = "";
        if (mes < 1 || mes > 12){
           resultado = "Mês inválido, digite de 1 a 12.";
        }
        else{
            if(mes > mesAtual){
                resultado = "O mês é futuro";
            } else if (mes < mesAtual){
                resultado = "O mês é passado";
            } else {
                resultado = "O mês é atual";
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do mês: ");
        int mes = sc.nextInt();
        System.out.println("Digite o numero do mês atual: ");
        int mesAtual = sc.nextInt();
        System.out.println(processamento(mes, mesAtual));
    }
}
