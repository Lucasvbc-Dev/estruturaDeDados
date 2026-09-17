package Lista;

public class ListaDinaminca {
    private No primeiro = null;
    private No ultimo = null;
    private int cont;

    public void add(int elemento){ //sempre adiciona no final
        No novo = new No(elemento);

        if(primeiro == null){ //Lista Vazia
            primeiro = novo;
            ultimo = novo;
        }else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        cont++;
    }

    public void add(int posicao, Object elemento) { //adiciona numa determinada posicao
        No novo = new No(elemento);

        if (posicao == 0) {
            novo.proximo = primeiro;
            primeiro = novo;

            if (ultimo == null) {
                ultimo = novo;
            }
            cont++;
            return;
        }
        No atual = primeiro;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        novo.proximo = atual.proximo;
        atual.proximo = novo;

        if (novo.proximo == null){
            ultimo = novo;
        }
        cont++;
    }


    public int size(){ //retorna o contador
        return cont;
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }



    public void remove(Object elemento) {

    }

    public void remove(int posicao) {

    }

    public int get(int posicao) {
        return 0;
    }

    public int indexOf(Object elemento) {
        return 0;
    }


    public String toString(){ //metodo para percorrer a lista (os principais metodos para entender é oque adiciona e esse que percorre
        String retorno = "[";

        No atual = primeiro; //essa
        while(atual != null) { // essa
            retorno += atual.valor + ""; //essa
            atual = atual.proximo; // e principalmente essa, é a base dos metodos de lista dinamica(percorre a lista)
        }
        retorno += "]";
        return retorno;
    }


    public boolean contains(Object elemento) {
        No atual = primeiro;

        while (atual != null) {
            if (atual.valor.equals(elemento)) {
                return true;
            }
            atual= atual.proximo;
        }
        return false;
    }
}
