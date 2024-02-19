package metodos;

public class CalRedes {

    private int numRedes;
    private int numHost;
    private int arr[] = {128, 64, 32, 16, 8, 4, 2, 1};

    public int numero(int redes) {
        int cont = 2;
        int valor;
        if (redes == 1 || redes == 2) {
            return 1;
        } else {
            for (;;) {
                valor = (int) Math.pow(2, cont);
                if (valor >= redes) {
                    break;
                } else {
                    cont++;
                }
            }
            return cont;
        }
    }

    public int numeroBits(int numredes, int numHost) {
        int valor = numero(numredes);
        int hostMax = 8 - valor;
        if (numredes > (Math.pow(2, 6))) {
            System.out.println("El numero de redes es mayor al que puede ser calculado, necesitas usar clase B");
        } else if (numHost > (Math.pow(2, hostMax))) {
            System.out.println("El numero de host es mayor al que puede ser calculado, necesitas usar clase B");
        }

        return valor;
    }

    public void numRedes(int numbit) {
        int ipInicial = 0, ipBroadcast = 0, mascara = 0;
        int valor = (int) Math.pow(2, numbit);

        for (int i = 0; i < numbit; i++) {
            mascara += arr[i];
        }
        System.out.println("Mascara de subred R.R.R." + mascara+"\n");
        System.out.println("Red\tIP de red\t\tIP's Validas\t\tIP broadcast");
        for (int i = 0; i < valor; i++) {
            ipBroadcast += arr[numbit - 1];
            System.out.println((i + 1) + "\tR.R.R." + ipInicial + "\t\tR.R.R." + (ipInicial + 1) + "-" + (ipBroadcast - 2) + "\t\tR.R.R." + (ipBroadcast - 1));
            ipInicial += arr[numbit - 1];
            System.out.print("\n");
        }

    }

}
