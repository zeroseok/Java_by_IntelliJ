package ch2;

public class _02_2_Variable_Literal_Constant {
    public static void main(String[] args) {
        final double PI = 3.14; //원주율을 상수로 선언

        double radius = 10.0; //원의 반지름
        double circleArea = radius * radius * PI; //원의 면적 계산

        System.out.println("원의 면적 = " + circleArea); //원의 면적을 화면에 출력한다.
    }
}
