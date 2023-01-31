public class LinkedStack<E> {
    private Node<E> topNode;
    private final E ERROR = null;
    public LinkedStack(){
        topNode = null;
    }

    public void push(E newItem){
        topNode = new Node<>(newItem, topNode);
    }

    public E pop(){
        if(isEmpty()) return ERROR;
        else {
            Node<E> temp = topNode;
            topNode = topNode.next;
            return temp.item;
        }
    }

    public E top(){
        if(isEmpty()) return ERROR;
        else return topNode.item;
    }

    public boolean isEmpty(){
        return (topNode == null);
    }

    public void popAll(){
        topNode = null;
    }

    public void copy(LinkedStack b){    //스택 연습문제 8번

    }

    public void printAll(){
        Node currNode=topNode;
        while(currNode!= null){
            System.out.println(currNode.item);
            currNode=currNode.next;
        }
    }

}
