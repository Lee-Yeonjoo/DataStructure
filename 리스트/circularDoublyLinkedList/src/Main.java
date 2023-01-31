public class Main {
    public static void main(String[] args){
        CircularDoublyLinkedList<Integer> a = new CircularDoublyLinkedList<>();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(3);
        a.add(1);
        a.add(5);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        System.out.println(a.get(4));
        System.out.println(a.get(5));
    }
}
