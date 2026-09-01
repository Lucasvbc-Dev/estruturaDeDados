package recursividade;

public class Mdc {
    public static int maiorDivisor(int a, int b){
        if (b == 0){
            return a;
        }
        return maiorDivisor(b, a % b);
    }

    public static void main(String[] args) {
        int resultado = maiorDivisor(12, 6);

        System.out.println("Recursividade.Mdc igual a: " + resultado);
    }

}
