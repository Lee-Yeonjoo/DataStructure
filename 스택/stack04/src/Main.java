import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str, str2 ="";

        str= sc.nextLine();

        for(int i=0; i<str.length();i++){
            st.push(str.charAt(i));
        }

        for(int i=0; i<str.length(); i++){
            str2 += st.pop();
        }

        if(str.equals(str2))
            System.out.println("집합의 원소이다.");
        else
            System.out.println("집합의 원소가 아니다.");
    }
}
