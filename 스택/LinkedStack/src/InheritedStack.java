public class InheritedStack<E> extends LinkedList<E>{   //코드6-6
    public InheritedStack(){
        super();
    }

    public void push(E newItem){
        add(0, newItem);
    }

    public E pop(){
        if(!isEmpty()) return remove(0);
        else return null;
    }

    public E top(){
        return get(0);
    }

    public void popAll(){
        clear();
    }

    public void printAll(){     //스택 연습문제 7번
        for(int i=0; i<super.len(); i++)
            System.out.println(get(i));
    }
}
