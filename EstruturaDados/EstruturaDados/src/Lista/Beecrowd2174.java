package Lista;

import java.util.Scanner;

public class Beecrowd2174 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        ListaEstatica pokedex = new ListaEstatica(n);

        for (int i = 0; i < n; i++) {
            String nome = entrada.next();

            if (!pokedex.contains(nome)) {
                pokedex.add(nome);
            }
        }

        int quantidade = 151 - pokedex.size();

        System.out.printf("Falta(m) %d pomekon(s).%n", quantidade);
    }
}