package study121501;

import java.util.Scanner;

public class study {
    
    public static void main(String[] args) {
        // int num=100;
        // System.out.println("한줄씩 출력"+num);
        // System.out.print("줄바꿈없이 출력"+num);
        // System.out.print("이어서 나온다");
        // System.out.printf("포멧지정 %d",num);
        // // %d - 정수, %f - 실수, %c - 문자, %s - 문자열

        // int a=10, b=20;
        // float c=3.12345f;

        // System.out.printf("%d %d", a , b );
        // System.out.printf("%f %d \n", c , a );

        // System.out.printf("실수는 %.1f 이다 \n", c);
        // System.out.printf("10+20 = %d",10+20);

        // Scanner sc = new Scanner(System.in); // 자바에서 입력받으려면 Scanner 객체필요
        
        // System.out.print("정수 두개 입력(하나 입력하고 엔터키 눌러서 두번째입력)");
        // int num1 = sc.nextInt();
        // short num2 = sc.nextShort(); 
        // System.out.println(num1 +" "+num2);
        
        // System.out.print("이름 입력: ");
        // String name = sc.next();

        // System.out.println("이름은" + name);

        // 사각형의 너비와 높이를 입력받아 넓이를 출력하세요.

        System.out.print("너비 : ");
        int width = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
       
        System.out.println("사각형이 넓이는 : "+ (width*height));

        // 국어, 영어, 역사 3과목의 점수를 입력받아서 총점과 평균 출력하세요
    
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int his = sc.nextInt();

        int total = kor+eng+his;
        float avg = total/3;
        System.out.println("총점 : "+total+" 평균) : "+avg);
        System.out.printf("총점 : %d점 , 평균 : %.2f점 \n",total,avg);
        
    }
}
