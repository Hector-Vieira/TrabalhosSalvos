import java.util.Scanner;
public class ex1 {
    public static void main (String[] args){
        double r, v;
        Scanner calculo = new Scanner (System.in);

        System.out.println("Digite o raio: ");
        r = calculo.nextDouble();
        v = (4.0/3.0) * Math.PI * Math.pow(r, 3);

        System.out.println("O volume da esfera é:" + v);
    }
}
