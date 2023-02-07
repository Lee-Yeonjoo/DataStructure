public class ArrayQueue<E> implements QueueInterface<E> {   //코드 7-2
    private E queue[];
    private int front, tail, numItems;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    public ArrayQueue(){
        queue = (E[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        tail = DEFAULT_CAPACITY-1;
        numItems = 0;
    }

    public ArrayQueue(int n){
        queue = (E[]) new Object[n];
        front =0;
        tail =n-1;
        numItems=0;
    }

    public void enqueue(E newItem){
        if(isFull()) System.out.println("Queue Full!");
        else{
            tail = (tail+1)%queue.length;
            queue[tail]=newItem;
            ++numItems;
        }
    }

    public void enqueue2(E newItem){     //큐 연습문제 9번
        if(isFull()){
            E[] queue2 = (E[]) new Object[queue.length*2];
            for(int i=0; i<queue.length; i++){
                queue2[i] = queue[i];
            }
            queue = queue2;
            tail = (tail+1)%queue.length;
            queue[tail]=newItem;
            ++numItems;
        }
        else{
            tail = (tail+1)%queue.length;
            queue[tail]=newItem;
            ++numItems;
        }
    }

    public boolean isFull(){
        return (numItems==queue.length);
    }

    public E dequeue(){
        if(isEmpty()) return ERROR;
        else{
            E queueFront = queue[front];
            front = (front+1)% queue.length;
            --numItems;
            return queueFront;
        }
    }

    public E front(){
        if(isEmpty()) return ERROR;
        else return queue[front];
    }

    public boolean isEmpty(){
        return (numItems==0);
    }

    public void dequeueAll(){
        queue=(E[]) new Object[queue.length];
        front =0;
        tail=queue.length-1;
        numItems=0;
    }

    public void printAll(){
        for(int i=0; i<numItems; i++){
            System.out.println(queue[i]);
        }
    }
}
