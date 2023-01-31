public class Main {
    public static void main(String[] args){
        System.out.println("리스트 연습문제 4번");
        ArrayList<Integer> a = new ArrayList<>();
        a.append(1);
        a.append(2);
        a.append(1);
        a.append(4);
        a.printInterval(1,3);

        System.out.println("리스트 연습문제 11번");
        System.out.println(a.lastIndexOf(1));
    }
}
