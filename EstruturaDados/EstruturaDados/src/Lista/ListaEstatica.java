package Lista;

/**
metodos que tenho que implementar: add(int elemento), add(int posicao, int elemento), size(), clear(),
contains(int elemento), remove(Integer elemento), remove(int posicao),
 get(int elemento), indexOf(int elemento)
**/

public class ListaEstatica {

    private Object[] v;
    private int cont;

    public ListaEstatica(int n) {
        v = new Object[n];
        cont = 0;
    }

    public void add(Object elemento) {
        v[cont] = equals(elemento);
        cont++;
    }

    public void add(int posicao, int elemento) {
        for (int i = 0; i > posicao; i++) {
            v[i] = v[i - 1];
        }
        v[posicao] = elemento;
        cont++;
    }

    public int size() {
        return cont;
    }

    public void clear() {
         cont = 0;
    }

    public boolean contains(Object elemento) {
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

    public Object get(int posicao){
        return v[posicao];
    }

    public int indexOf(Object elemento){
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

    public void show(){
        for (int i = 0; i < cont; i++) {
            System.out.println(v[i] + " ");

            System.out.println();
        }
    }
}


