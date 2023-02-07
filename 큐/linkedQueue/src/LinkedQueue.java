public class LinkedQueue<E> implements QueueInterface<E>{
    private Node<E> tail;
    private final E ERROR =null;

    public LinkedQueue(){
        tail=null;
    }

    public void enqueue(E newItem){
        Node<E> newNode = new Node<>(newItem);
        if(isEmpty()){
            newNode.next=newNode;   //원소가 한개뿐이라 자기자신을 가리키도록
            tail=newNode;
        }
        else{
            newNode.next=tail.next;
            tail.next=newNode;
            tail=newNode;
        }
    }

    public E dequeue(){
        if(isEmpty()) return ERROR;
        else{
            Node<E> front=tail.next;
            if(front==tail)
                tail=null;
            else{
                tail.next=front.next;
            }
            return front.item;
        }
    }

    public E front(){
        if(isEmpty()) return ERROR;
        else return tail.next.item;
    }

    public boolean isEmpty(){
        return (tail==null);
    }

    public void dequeueAll(){
        tail=null;
    }

    public void printAll(){
        Node<E> n = tail.next; //n=front
        do{
            System.out.println(n.item);
            n=n.next;
        } while(n != tail.next);
    }
}
