import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double metros, cm;
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o numero de metros que ira ser convertido para cm.");
        metros = console.nextDouble();
        cm = metros * 100;

        System.out.println("o resultado da conversão é : " + cm + " Centimetros.");
        console.close();

    }
}
