package study121502;

import java.util.Scanner;

public class study {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 40;

        if(num1 > num2){
            System.out.println("큰 숫자 : "+num1);
        }else{
            System.out.println( "큰숫자: "+num2);
        }
        
        Scanner sc = new Scanner(System.in);
        // int tall=sc.nextInt();
        // // 키가 130이상만 바이킹 탈 수 있다.
        // if(tall >= 130)
        //     System.out.println("바이킹 탑승 가능");
        // else
        //     System.out.println("바이킹 탑승 불가");
        
            System.out.print("이름 입력 : ");
            String name = sc.nextLine(); 
            if( name.equals("이순신")){
                System.out.println("올바른 이름을 입력했습니다.");
            }else
                System.out.println("다시 입력하세요");

         // var word="banana"; word.indexOf("na");  word.includes("a");
            if( name.contains("순")){

            }

            if( name.indexOf("신") != -1 )
                System.out.println("신이 입력되었습니다.");
            else
                System.out.println("잘못입력했습니다.");

    }
    
}
