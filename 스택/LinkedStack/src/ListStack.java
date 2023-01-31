public class ListStack<E> implements StackInterface<E>{ //코드6-7
    private ListInterface<E> list;

    public ListStack(){
        list = new LinkedList<E>();
    }

    public void push(E newItem){
        list.add(0, newItem);
    }

    public E pop(){
        return list.remove(0);
    }

    public E top(){
        return list.get(0);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void popAll(){
        list.clear();
    }

    public void printAll(){     //스택 연습문제 7번
        for(int i=0; i<list.len();i++)
            System.out.println(list.get(i));
    }
}
