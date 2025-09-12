import java.sql.SQLOutput;
import java.util.Scanner;
public class ex2 {
    public static double calculo_salario(int horasTrabalhadas, double valorPorHora){
        double salario;
        if(horasTrabalhadas < 200){
            salario = horasTrabalhadas * valorPorHora;

        } else {
            System.out.println("Funcionário com horas extras");
            double salario_extra = (horasTrabalhadas - 200) * (valorPorHora * 50/100);
            salario  = 200 * valorPorHora + salario_extra;
        }
        return salario;
    }

    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        System.out.println("Digite sua matrícula: ");
        int matricula = banco.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = banco.nextInt();
        System.out.println("Digite seu valor por hora trabalhada: ");
        double valorPorHora = banco.nextDouble();
        System.out.println("Qual mês se refere essas informações? ");
        String mes = banco.next();

        System.out.println("O mês é: " + mes);
        System.out.println("A matrícula é:" + matricula);
        System.out.println("O numero de horas são: " + horasTrabalhadas);
        System.out.printf("O salário do funcionário é: R$ %.2f", calculo_salario(horasTrabalhadas, valorPorHora));

        banco.close();
    }
}
