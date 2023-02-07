public class ListQueue<E> implements QueueInterface<E> {    //코드7-7
    private ListInterface<E> list;

    public ListQueue(){
        list = new ArrayList<>();
    }

    public void enqueue(E newItem){
        list.append(newItem);
    }

    public E dequeue(){
        return list.remove(0);
    }

    public E front(){
        return list.get(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void dequeueAll(){
        list.clear();
    }

    public void printAll(){
        for(int i=0; i<list.len(); i++)
            System.out.println(list.get(i));
    }
}
