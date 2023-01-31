public class LinkedList_ex6<E> {
    private Node<E> head;
    //private int numItems;

    public LinkedList_ex6(){
        //numItems()=0;
        head = new Node<>(null,null);
    }

    public void add(int index, E item){     //특정 위치에 원소 삽입. 맨끝도 되는건가?? 그럼 append메소드 왜 있지
        if(index >=0 && index <= numItems()){
            Node<E> prevNode = getNode(index-1);
            Node<E> newNode = new Node<>(item, prevNode.next);
            prevNode.next = newNode;
            //numItems()++;
        }
    }

    public void append(E item){     //맨끝에서 원소 추가
        Node<E> prevNode = head;
        while(prevNode.next != null){
            prevNode = prevNode.next;
        }
        Node<E> newNode = new Node<>(item, null);
        prevNode.next = newNode;
        //numItem()++;
    }

    public E remove(int index){     //해당 위치의 원소 삭제
        if(index >= 0 && index < numItems()){
            Node<E> prevNode = getNode(index-1);
            Node<E> currNode = prevNode.next;
            prevNode.next = currNode.next;
            //numItems()--;
            return currNode.item;
        }
        else
            return null;
    }

    public boolean removeItem(E x){     //특정 원소 찾아서 삭제
        Node<E> currNode = head;
        Node<E> prevNode;
        for(int i=0; i<numItems(); i++){
            prevNode = currNode;    //커노드는 처음에 더미헤드임 그래서 프리노드가 되는거임
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x)==0){
                prevNode.next = currNode.next;
                //numItems()--;
                return true;
            }
        }
        return false;
    }

    public E get(int index){        //해당 인덱스의 노드의 아이템 반환
        if(index >=0 && index<=numItems()-1){
            return getNode(index).item;
        }
        else return null;
    }

    public Node<E> getNode(int index){  //해당 인덱스의 노드 반환
        if(index>=-1 && index<=numItems()-1){
            Node<E> currNode = head;
            for(int i=0; i<=index; i++){
                currNode = currNode.next;
            }
            return currNode;
        }
        else return null;
    }

    public void set(int index, E x){        //해당 인덱스의 노드의 아이템 변경
        if(index>=0 && index<=numItems()-1){
            getNode(index).item=x;
        }
        else
            System.out.println("범위를 벗어남");
    }

    public final int NOT_FOUND = -12345;
    public int indexOf(E x){        //해당 아이템과 일치하는 노드가 몇번째 노드인지 반환
        Node<E> currNode=head;
        int i;
        for(i=0; i<numItems(); i++){
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x)==0) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    public int len(){
        return numItems();
    }

    public boolean isEmpty(){
        return numItems()==0;
    }

    public void clear(){
        //numItems()=0;
        head=new Node<>(null,null);
    }

    public boolean contains(E x){   //리스트 연습문제 2번
        return !(indexOf(x) == NOT_FOUND);
    }

    public void printInterval(int i, int j){    //리스트 연습문제 5번
        if(i>=0 && i<numItems()) {
            Node<E> tNode = getNode(i); //중괄호해주면 declaration not allowed here 오류 해결됨;;
            for(int k=i; k<=j; k++){
                System.out.println(tNode.item);
                tNode = tNode.next;
            }
        }
    }

    public int numItems(){      //리스트 연습문제 6번
        int cnt =0;
        Node n=head;
        while(n.next != null){
            cnt++;
            n = n.next;
        }
        return cnt;
    }

    public int numItemsRecursive(){     //리스트 연습문제 6번
        Node n = head;
        int i=0;
        while(n.next!=null){
            i++;
            n = n.next;
        }
        if(i==0)
            return 0;
        Node pnode = getNode(i-2);
        pnode.next =null;
        return 1+numItems();
    }
}
