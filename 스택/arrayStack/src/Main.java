public class Main {
    public static void main(String[] args){
        System.out.println("스택 연습문제 9번");
        ArrayStack<Integer> a = new ArrayStack<>(5);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);  //스택 a는 꽉 찼다.

        if(a.isFull())
            System.out.println("a is full");
        a.push(6);
        System.out.println(a.pop());


        System.out.println("스택 연습문제 5번");
        a.printAll();


    }
}
