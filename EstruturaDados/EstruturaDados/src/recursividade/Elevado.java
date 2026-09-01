package recursividade;

public class Elevado {

    public static int elevado(int n){
        if(n == 0){
            return 1;
        }
        return 2*elevado(n-1);
    }

    public static void main(String[] args) {
        int resultado = elevado(5);

        System.out.println("O elevado do número é igual a: " + resultado);
    }
}
