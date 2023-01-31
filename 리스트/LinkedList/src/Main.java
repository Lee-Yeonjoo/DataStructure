public class Main {
    public static void main(String[] args){
        System.out.println("리스트 연습문제 2번");
        LinkedList<Integer> a = new LinkedList<>();
        a.append(1);
        a.append(2);
        a.append(3);
        a.append(4);
        if(a.contains(3))
            System.out.println("3이 존재함");
        if(!a.contains(5))
            System.out.println("5가 존재하지 않음");

        System.out.println("리스트 연습문제 5번");
        a.printInterval(1,2);

        System.out.println("리스트 연습문제 6번");
        LinkedList_ex6<Integer> b = new LinkedList_ex6<>();
        b.add(0,1);
        b.add(1,2);
        b.add(2,3);
        b.add(3,4);
        b.add(4,5);
        System.out.println(b.numItems());
        System.out.println(b.numItemsRecursive());

        System.out.println("리스트 연습문제 7번");
        System.out.println(a.len());
        a.remove(1,3);
        System.out.println(a.len());

        System.out.println("리스트 연습문제 9번");
        LinkedList c = new LinkedList();
        LinkedList d = new LinkedList();
        c.append(1);
        c.append(2);
        d.append(3);
        d.append(4);
        c.concat(c,d);
        System.out.println(c.get(0));
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        System.out.println(c.get(3));

        System.out.println("리스트 연습문제 10번");
        c.nodeCheck(c.getNode(1),d.getNode(1));
        c.nodeCheck(c.getNode(1),c.getNode(2));

        System.out.println("리스트 연습문제 12번");
        LinkedList<Integer> e = new LinkedList<>();
        e.append(1);
        e.append(2);
        e.append(1);
        e.append(3);
        System.out.println(e.lastIndexOf(1));


    }
}
