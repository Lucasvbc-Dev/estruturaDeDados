package ListaEstatica;

/**
metodos que tenho que implementar: add(int elemento), add(int posicao, int elemento), size(), clear(),
contains(int elemento), remove(Integer elemento), remove(int posicao),
 get(int elemento), indexOf(int elemento)
**/

public class ListaEstatica {

    private int[] v;
    private int cont;

    public ListaEstatica(int n) {
        v = new int[n];
        cont = 0;
    }

    public void add(int elemento) {
        v[cont] = elemento;
        cont++;
    }

    public void addTudo(int posicao, int elemento) {
        for (int i = 0; i > posicao; i++) {
            v[i] = v[i - 1];
        }
        v[posicao] = elemento;
        cont++;
    }

    public int size() {
        return cont;
    }

    public int clear() {
        return cont = 0;
    }

    public boolean contains(int elemento) {
        for (int i = 0; i < cont; i++) {
            if (v[i] == elemento) {
                return true;
            }
        }
            return false;
    }

    public void remove(int elemento){
        v[cont] = elemento;
        cont--;
    }

    public void removePosicao(int posicao){
        for (int i = 0; i < cont; i++) {
            cont--;
        }
    }

    public int get(int elemento){
        return v[elemento];
    }

    public int indexOf(int elemento){
        for (int i = 0; i < cont; i++) {
            if (v[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public void exibir() {
        for (int i = 0; i < cont; i++)
            System.out.print(v[i] + " ");

        System.out.println();
    }
}


