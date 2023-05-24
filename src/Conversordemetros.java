import java.util.Scanner;
public class Conversordemetros {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite o tamanho em metros: ");
        double metros = entrada.nextDouble();
        double centimentros = metros*100;
        System.out.println(metros+"o tamanho em centimetros equivale a : "+centimentros+"centimentros");
        entrada.close();
    }
}
