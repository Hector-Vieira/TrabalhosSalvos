import java.sql.SQLOutput;
import java.util.Scanner;
public class ex5 {
    public static String calculo_idade (int anoNascimento){
        int idade = 2025 - anoNascimento;
        if (idade < 16){
            return "Você não pode nem votar nem ter carteira. Pode brincar ué.";
        } else if (idade >= 16 && idade < 18){
            return "Pode votar. Mas não vota no lula";
        } else {
            return "Você pode ter carteira de habilitação e votar, não beba e dirija e nem vota no lula";
        }
    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = dados.nextInt();
        System.out.println(calculo_idade(anoNascimento));
    }
}
