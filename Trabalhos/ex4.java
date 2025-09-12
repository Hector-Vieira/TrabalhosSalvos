import java.util.Scanner;
public class ex4 {
    public class double calculo_peso(String sexo, double altura, double peso){
        double peso_ideal;
        if(sexo.equalsIgnoreCase("M")){
            peso_ideal = (72.7 * altura) - 58;
            if(peso_ideal > peso){
                System.out.println("Você está acima do peso");
            } else {
                System.out.println("Seu peso está na média");
            }
        } else if (sexo.equalsIgnoreCase("F")){
            peso_ideal = (62.1 * altura) + 44.7;
            if(peso_ideal > peso){
                System.out.println("Você está acima do peso.");
            }else {
                System.out.println("O seu peso está na média.");
            }
        } else {
            System.out.println("Sexo inválido. Digite M ou F.");
        }
        return peso_ideal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sexo (M para Masculino e F para Feminino): ");
        String sexo = sc.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite sua peso: ");
        double peso = sc.nextDouble();
    }
}
