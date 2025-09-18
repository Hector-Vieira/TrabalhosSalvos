import java.util.Scanner;
public class ex8 {
    public static String processamento (int idade){
        String resultado = "";
        if (idade >= 5 && idade <= 7){
            resultado = "O aluno pertence ao Infantil A";
        } else if (idade >= 8 && idade <= 10){
            resultado = "O aluno pertence ao Infantil B";
        } else if (idade >= 11 && idade <= 13){
            resultado = "O aluno pertence ao Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            resultado = "O aluno pertence ao Juvenil b";
        } else if (idade >= 18 ){
            resultado = "O aluno pertence a classe Adulto";
        } else {
            resultado = "O aluno ainda é novo demais.";
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            if (idade == 0){
                System.out.println("Sistema encerrado");
                break;
            }
            System.out.println(processamento(idade));
        }
    }
}
