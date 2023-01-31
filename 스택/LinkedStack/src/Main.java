public class Main { //스택 연습문제 8번
    public static void main(String[] args){
        LinkedStack<Integer> a = new LinkedStack<>();   //객체 a 생성
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        int size = 5;

        LinkedStack<Integer> b = new LinkedStack<>();   //a를 복사할 객체 b
        int[] temp1 = new int[size]; //a를 pop하고 저장할 배열;
        int i=0;

        while(!a.isEmpty()){
            temp1[i] = a.pop();
            i++;
        }

        for(int j=size-1; j>=0; j--){
            a.push(temp1[j]);
            b.push(temp1[j]);
        }

        while(!b.isEmpty()){
            System.out.println(a.pop());
            System.out.println(b.pop());
        }


        //스택 연습문제 10번
        System.out.println("스택 연습문제 10번");
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.printReverse();

        //스택 연습문제 6번
        System.out.println("스택 연습문제 6번");
        LinkedStack<Integer> st = new LinkedStack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.printAll();

        //스택 연습문제 7번
        System.out.println("스택 연습문제 7번 6-6");
        InheritedStack st1 = new InheritedStack();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.printAll();

        System.out.println("스택 연습문제 7번 6-7");
        ListStack<Integer> st2 = new ListStack<>();
        st2.push(1);
        st2.push(2);
        st2.push(3);
        st2.printAll();
    }
}
