import java.util.Scanner;

public class Multometro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int conductores = 1; conductores <=5; conductores++) {
            System.out.println("nombre del conductor: ");
            String conductor = input. nextLine();
            System.out.println("ingrese su velocidad en km/h: ");
            double velocidad = input.nextDouble();

            if (velocidad>60) {
                double multa = (velocidad - 60) * 2.5;
                System.out.println(conductor + " su velocidad excedio los 60km/h y resivio una multa de: " + multa);
            } else {
                System.out.println(conductor + " felicitaciones su velocidad esta por devajo de 60km/h.");
            }
            
        }
        input.close();
    }
}
