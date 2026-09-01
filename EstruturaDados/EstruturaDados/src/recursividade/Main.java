package recursividade;

public class Main {

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }
        return n*fatorial(n-1);
    }

    public static void main(String[] args) {
        int f = fatorial(5);

        System.out.println(f);
    }
}