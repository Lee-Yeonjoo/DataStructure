public class Main {
    public static void main(String[] args){
        System.out.println("큐 연습문제 5번");
        ArrayQueue<Integer> a = new ArrayQueue<>();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.printAll();

        System.out.println("큐 연습문제 9번");
        ArrayQueue<Integer> b = new ArrayQueue<>(3);
        b.enqueue(1);
        b.enqueue(2);
        b.enqueue(3);
        b.enqueue2(4);
        b.printAll();
    }
}
