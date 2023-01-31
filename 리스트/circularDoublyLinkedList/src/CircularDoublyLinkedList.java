public class CircularDoublyLinkedList<E> {
    private BidirectionalNode<E> head;
    private int numItems;

    public CircularDoublyLinkedList(){
        numItems =0;
        head = new BidirectionalNode<>(null);

        head.next = head.prev = head;
    }

    public void add(int index, E x){
        if(index >= 0 && index <= numItems){
            BidirectionalNode<E> prevNode = getNode(index-1);
            BidirectionalNode<E> newNode = new BidirectionalNode<>(prevNode, x, prevNode.next);
            newNode.next.prev = newNode;
            prevNode.next = newNode;
            numItems++;
        }
        else
            System.out.println("범위 벗어남");
    }

    public void append(E x){
        BidirectionalNode<E> prevNode = head.prev; //헤드의 이전 노드는 마지막 노드니까
        BidirectionalNode<E> newNode = new BidirectionalNode<>(prevNode, x, head);
        prevNode.next = newNode;
        head.prev = newNode;
        numItems++;
    }

    public E remove(int index){
        if(index >= 0 && index <= numItems-1){
            BidirectionalNode<E> currNode = getNode(index);
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            numItems--;
            return currNode.item;
        }
        else return null;
    }

    public boolean removeItem(E x){
        BidirectionalNode<E> currNode = head;
        for(int i=0; i<=numItems-1; i++){
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x)==0){
                currNode.prev.next = currNode.next;
                currNode.next.prev = currNode.prev;
                numItems--;
                return true;
            }
        }
        return false;
    }

    public E get(int index){
        if(index >=0 && index <= numItems-1){
            return getNode(index).item;
        }
        else return null;
    }

    public void set(int index, E x){
        if(index >=0 && index <= numItems-1){
            getNode(index).item = x;
        }
        else System.out.println("범위 벗어남");
    }

    public BidirectionalNode<E> getNode(int index){
        if(index >= -1 && index <= numItems-1){
            BidirectionalNode<E> currNode = head;
            if(index < numItems/2){
                for(int i =0 ;i<=index; i++){
                    currNode = currNode.next;
                }
            }
            else{
                for(int i = numItems-1; i>=index ; i--){
                    currNode=currNode.prev;
                }
            }
            return currNode;
        }
        else return null;
    }

    public final int NOT_FOUND = -12345;
    public int indexOf(E x){
        BidirectionalNode<E> currNode = head;
        for(int i =0; i<numItems-1; i++){
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x)==0)
                return i;
        }
        return NOT_FOUND;
    }

    public int len(){
        return numItems;
    }

    public boolean isEmpty(){
        return numItems==0;
    }

    public void clear(){
        numItems=0;
        head.next = head.prev = head;
    }

    public void add(int x){     //리스트 연습문제 8번
        BidirectionalNode<E> currNode = head;
        if (numItems > 0) {
            for (int i = 0; i < numItems; i++) {
                currNode = currNode.next;
                if (((Comparable) (currNode.item)).compareTo(x) == 1)
                    break;
            }
            BidirectionalNode newNode = new BidirectionalNode(currNode.prev, x, currNode);
            currNode.prev.next = newNode;
            currNode.prev = newNode;
        }
        else
        {
            BidirectionalNode newNode =new BidirectionalNode(head, x, head);
            head.next = newNode;
            head.prev = newNode;
        }
        numItems++;
    }
}
