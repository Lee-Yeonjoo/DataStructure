public class Main {
    public static void main(String[] args){
        //큐 연습문제 6번
        LinkedQueue<Integer> a = new LinkedQueue<>();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(4);
        a.printAll();

        //큐 연습문제 8번
        LinkedQueue<Integer> b = new LinkedQueue<>();
        int[] temp = new int[10];
        for(int i=0; i<temp.length; i++) temp[i]=-12345;
        int i=0;
        while(!a.isEmpty()){
            temp[i]=a.dequeue();
            i++;
        }
        i=0;
        while(temp[i]!=-12345){
            a.enqueue(temp[i]);
            b.enqueue(temp[i]);
            i++;
        }
        System.out.println("a의 내용:");
        a.printAll();
        System.out.println("b의 내용:");
        b.printAll();
    }
}
