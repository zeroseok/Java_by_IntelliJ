package chap_01;

public class _02_1_JavaBasicStructure {
    public static int sum(int n, int m){ //메소드
        return n+m;
    }

    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';

        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
