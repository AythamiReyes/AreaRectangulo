import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int ladoMayor, ladoMenor, area, perimetro;
        System.out.println("Programa que Cálcula el área y el perímetro de un rectángulo.");
        System.out.print("Introduce el valor del lado mayor: ");
        ladoMayor = tec.nextInt();
        System.out.print("Introduce el valor del lado menor: ");
        ladoMenor = tec.nextInt();
        area = ladoMayor * ladoMenor;
        perimetro = (ladoMayor + ladoMenor)*2;
        System.out.println("El área del rectangulo : " + area);
        System.out.println("El perímetro del rectangulo :" + perimetro);
    }
}
