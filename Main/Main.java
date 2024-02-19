package Main;

import java.util.Scanner;
import metodos.CalRedes;

public class Main {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int numRedes, numHost;
        System.out.println("Ingresa el número de redes y host");
        numRedes = l.nextInt();
        numHost = l.nextInt();

        int numBit = new CalRedes().numeroBits(numRedes, numHost);
        CalRedes ob = new CalRedes();

        ob.numRedes(numBit);
    }
}
