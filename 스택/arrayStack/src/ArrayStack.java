public class ArrayStack<E> {
    private E stack[];
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    public ArrayStack(){
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    public ArrayStack(int n){
        stack = (E[]) new Object[n];
        topIndex = -1;
    }

    public void push(E newItem){
        if(isFull()){   //스택 연습문제 9번
            E stack2[] = (E[]) new Object[stack.length*2];
            for(int i=0; i < stack.length; i++){
                stack2[i] = stack[i];
            }
            stack = stack2; //이걸 꼭 해줘야함!! 참조값 바꾸기(배열 이름바꾸기)
            stack2[++topIndex] = newItem;
        }
        else stack[++topIndex] = newItem;
    }

    public E pop(){
        if(isEmpty()) return ERROR;
        else return stack[topIndex--];
    }

    public E top(){
        if(isEmpty()) return ERROR;
        else return stack[topIndex];
    }

    public boolean isEmpty(){
        return (topIndex<0);
    }

    public boolean isFull(){
        return (topIndex == stack.length-1);
    }

    public void popAll(){
        stack = (E[]) new Object[stack.length];
        topIndex = -1;
    }

    //스택 연습문제 5번
    public void printAll(){
        for(int i=topIndex; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}
