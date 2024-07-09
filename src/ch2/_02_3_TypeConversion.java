package ch2;

public class _02_3_TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b + i); // b가 int 타입으로 자동변환
        System.out.println(10 / 4); // 정수 나누기
        System.out.println(10.0 / 4); // 4가 4.0으로 자동 변환
        System.out.println((char)0x12340041);
        //강제 casting = 강제 형변환, char는 2byte 이므로 하위 2byte를 강제casting함 => 0x41은 아스키코드 A 이다.

        System.out.println((byte)(b + i)); //227 을 16진수로 표현 -> 0xE3
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
