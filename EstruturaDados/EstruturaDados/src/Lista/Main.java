package Lista;

public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        lista.add(5);
        lista.add(10);
        lista.add(30);
        lista.add(50);
        lista.add(1);

        System.out.println("Lista: ");
        lista.exibir();

        System.out.println("Tamanho da lista: " + lista.size());

        System.out.println("Elemento na posição 2: " + lista.get(2));

        System.out.println("Posição do elemento 30: " + lista.indexOf(30));

        System.out.println("A lista contém 20? " + lista.contains(20));
        System.out.println("A lista contém 50? " + lista.contains(50));

        lista.clear();


        System.out.println("Depois do clear:");
        lista.exibir();

        System.out.println("Tamanho depois do clear: " + lista.size());
    }
}
