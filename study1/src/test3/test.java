package test3;

public class test {
    
    public static void main(String[] args){
        // 비트연산자
        System.out.println(10 & 34); // & -> and 비트연산자
        System.out.println(14 | 12); // | -> or 비트연산자
        System.out.println( ~13 ); // ~ -> not 비트연산자
        System.out.println( ~-14 );
        System.out.println( 29 ^ 13 ); // ^ -> xor 비트 연산자 

        // 시프트 비트 연산자 -> 이동 연산자
        System.out.println( 10 << 2 ); // << -> 왼쪽시프트연산자     8bit에서 숫자만큼 왼쪽으로 이동 빈곳은 양수일땐 0 / 음수일땐 1 로 채워준다
        System.out.println( 24 >> 3 ); // >> -> 오른쪽시프트연산자   8bit에서 숫자만큼 오른쪽으로 이동 빈곳은 양수일땐 0 / 음수일땐 1 로 채워준다

        System.out.println( 4 << 2 ); 
    }
} 
