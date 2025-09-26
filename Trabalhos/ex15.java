import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'OK' para começar");
        String comando = sc.nextLine();
        int minutos = 10;
        int segundos = minutos * 60;

        for (int i = segundos; i > 0; i--){
            int min = i / 60;
            int sec = i % 60;
            System.out.printf("%02d:%02d\n", min, sec);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FIM!");
    }
}
