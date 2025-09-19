import java.util.Scanner;
public class ex9 {
    public static int processamento (int valor_compra, int codigo_pagamento){
        int resultado = 0;
        int parcelas = 0;
        switch(codigo_pagamento){
             case 1:
                resultado = valor_compra - valor_compra * (10 / 100);
             case 2:
                resultado = valor_compra - valor_compra * (8 / 100);
             case 3:
                resultado = valor_compra / 5;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total da compra: ");
        int valor_compra = sc.nextInt();
        System.out.println("Digite o código de pagamento");
        int codigo_pagamento = sc.nextInt();
    }
}
