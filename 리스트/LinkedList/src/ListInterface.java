public interface ListInterface<E> {
    public void add(int index, E item);
    public void append(E item);
    public E remove(int index);
    public boolean removeItem(E x);
    public E get(int index);
    public Node<E> getNode(int index);
    public void set(int index, E x);
    public int indexOf(E x);
    public int len();
    public boolean isEmpty();
    public void clear();
}
