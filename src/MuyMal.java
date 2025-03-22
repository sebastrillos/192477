import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numero = 1;
        int sumaMultiplosDeTres = 0;
        int sumaMultiplosDeCinco = 0;
        int sumaNoMultiplos = 0;

        System.out.print("Ingrese un número límite:");
        int numeroLimite = input.nextInt();

        while (numero <= numeroLimite) {
            if (numero % 3 == 0) {
                sumaMultiplosDeTres = sumaMultiplosDeTres + numero;
                System.out.println(numero + " es múltiplo de 3");
            }

            if (numero % 5 == 0) {
                sumaMultiplosDeCinco = sumaMultiplosDeCinco + numero;
                System.out.println(numero + " es múltiplo de 5");
            }

            if (numero % 3 != 0 && numero % 5 != 0) {
                sumaNoMultiplos = sumaNoMultiplos + numero;
                System.out.println(numero + " no es múltiplo de 3 ni 5");
            }

            numero++;
            input.close();
        }

        System.out.println("Suma de múltiplos de 3: " + sumaMultiplosDeTres);
        System.out.println("Suma de múltiplos de 5: " + sumaMultiplosDeCinco);
        System.out.println("Suma del resto: " + sumaNoMultiplos);
    }
}
