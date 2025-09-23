import java.util.Scanner;
public class ex9 {
    public static String processamento (int valor_compra, int codigo_pagamento){
        double total;
        double quantidade_parcelas;
        double valor_parcelas;

        switch (codigo_pagamento){
            case 1:
                total = valor_compra - valor_compra * (10.0 / 100.0);
                quantidade_parcelas = 1;
                valor_parcelas = total;
                break;
            case 2:
                total = valor_compra - valor_compra * (5.0 / 100.0);
                quantidade_parcelas = 1;
                valor_parcelas = total;
                break;
            case 3:
                total = valor_compra;
                quantidade_parcelas = 5;
                valor_parcelas = valor_compra / 5.0;
                break;
            case 4:
                total = valor_compra + valor_compra * (5.0 / 100.0);
                quantidade_parcelas = 10;
                valor_parcelas = total / 10.0;
                break;
            default:
                return "Dígito inválido.";
        }
            return "O valor total é: " + String.format("%.2f", total)
                    + "\nA Quantidade de parcelas é: " + String.format("%.2f", quantidade_parcelas)
                    + "\nO valor das parcelas são: " + String.format("%.2f", valor_parcelas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total da compra: ");
        int valor_compra = sc.nextInt();
        System.out.println("Digite o código de pagamento");
        int codigo_pagamento = sc.nextInt();
        System.out.println(processamento(valor_compra, codigo_pagamento));
    }
}