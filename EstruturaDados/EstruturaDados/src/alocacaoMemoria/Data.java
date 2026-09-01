package alocacaoMemoria;

public class Data {

    private int dia = 1;
    private int mes = 1;
    private int ano = 1800;


    public Data(int d, int m, int a){
        if ((d >= 1 && d <= 31) &&
            (m >= 1 && m <= 12) &&
            (a >= 1800 && a <= 2100)){
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }
        else{
            System.out.println("Erro: Data inválida");
        }
    }

    public static void main(String[] args) {
        Data d = new Data(21, 10, 2010);

        System.out.println(d);
    }
}
