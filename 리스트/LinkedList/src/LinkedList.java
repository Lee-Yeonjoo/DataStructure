public class LinkedList<E> implements ListInterface<E> {
    public Node<E> head;
    public int numItems;

    public LinkedList(){
        numItems=0;
        head = new Node<>(null,null);
    }

    public void add(int index, E item){     //특정 위치에 원소 삽입. 맨끝도 되는건가?? 그럼 append메소드 왜 있지
        if(index >=0 && index <= numItems){
            Node<E> prevNode = getNode(index-1);
            Node<E> newNode = new Node<>(item, prevNode.next);
            prevNode.next = newNode;
            numItems++;
        }
    }

    public void append(E item){     //맨끝에서 원소 추가
        Node<E> prevNode = head;
        while(prevNode.next != null){
            prevNode = prevNode.next;
        }
        Node<E> newNode = new Node<>(item, null);
        prevNode.next = newNode;
        numItems++;
    }

    public E remove(int index){     //해당 위치의 원소 삭제
        if(index >= 0 && index < numItems){
            Node<E> prevNode = getNode(index-1);
            Node<E> currNode = prevNode.next;
            prevNode.next = currNode.next;
            numItems--;
            return currNode.item;
        }
        else
            return null;
    }

    public boolean removeItem(E x){     //특정 원소 찾아서 삭제
        Node<E> currNode = head;
        Node<E> prevNode;
        for(int i=0; i<numItems; i++){
            prevNode = currNode;    //커노드는 처음에 더미헤드임 그래서 프리노드가 되는거임
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x)==0){
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        }
        return false;
    }

    public E get(int index){        //해당 인덱스의 노드의 아이템 반환
        if(index >=0 && index<=numItems-1){
            return getNode(index).item;
        }
        else return null;
    }

    public Node<E> getNode(int index){  //해당 인덱스의 노드 반환
        if(index>=-1 && index<=numItems-1){
            Node<E> currNode = head;
            for(int i=0; i<=index; i++){
                currNode = currNode.next;
            }
            return currNode;
        }
        else return null;
    }

    public void set(int index, E x){        //해당 인덱스의 노드의 아이템 변경
        if(index>=0 && index<=numItems-1){
            getNode(index).item=x;
        }
        else
            System.out.println("범위를 벗어남");
    }

    public final int NOT_FOUND = -12345;
    public int indexOf(E x){        //해당 아이템과 일치하는 노드가 몇번째 노드인지 반환(일치하는 첫 노드 반환)
        Node<E> currNode=head;
        int i;
        for(i=0; i<numItems; i++){
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x)==0) {
                return i;
            }
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
        head=new Node<>(null,null);
    }

    public boolean contains(E x){   //리스트 연습문제 2번
        return !(indexOf(x) == NOT_FOUND);
    }

    public void printInterval(int i, int j){    //리스트 연습문제 5번
        if(i>=0 && i<numItems) {
            Node<E> tNode = getNode(i); //중괄호해주면 declaration not allowed here 오류 해결됨;;
            for(int k=i; k<=j; k++){
                System.out.println(tNode.item);
                tNode = tNode.next;
            }
        }
    }

    public void remove(int index, int k){   //리스트 연습문제 7번
        if(index >=0 && index <= numItems-1){
            Node<E> prevNode = getNode(index-1);
            for(int i=0; i<k; i++){
                Node<E> currNode = prevNode.next;
                prevNode.next = currNode.next;
                numItems--;
            }
        }
        else
            System.out.println("범위 벗어남");
    }

    public void concat(LinkedList list1, LinkedList list2){ //리스트 연습문제 9번
        Node<E> n = getNode(list1.numItems-1);
        n.next= list2.head.next;
        numItems += list2.numItems; //numItem 꼭 챙겨야함!! 안그러면 다른데서 오류남
    }

    public void nodeCheck(Node n1, Node n2){    //리스트 연습문제 10번
        boolean check1=false, check2 = false;
        Node<E> n = head;
        while(n.next != null){
            if(n == n1)
                check1 = true;
            if(n == n2)
                check2 = true;
            n=n.next;
        }
        if(check1 && check2)
            System.out.println("같은 연결리스트에 속함");
        else System.out.println("같은 연결리스트에 속하지 않음");
    }

    public int lastIndexOf(E x){    //리스트 연습문제 12번
        Node<E> n = head;
        int cnt=0;  //해당 x가 몇개 있는지 세주는 변수
        int cnt2=0;
        int i=0;

        while(n.next!=null){
            n = n.next;
            if(((Comparable)(n.item)).compareTo(x)==0)
                cnt++;
        }
        n=head;
        while(n.next!=null){
            n = n.next;
            if(((Comparable)(n.item)).compareTo(x)==0){
                cnt2++;
                if(cnt2==cnt){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}
