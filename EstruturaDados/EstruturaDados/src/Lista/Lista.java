package Lista;

public interface Lista {
    public void add(Object elemento);
    public void add(int posicao, Object elemento);
    public int size();
    public void clear();
    public boolean contains(Object elemento);
    public void remove(Object elemento);
    public void remove(int posicao);
    public int get(int posicao);
    public int indexOf(Object elemento);
}
