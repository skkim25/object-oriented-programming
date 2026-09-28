import java.util.Scanner;
public class Scanner1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //키보드를 사용한다면 생성자에 System.in을 전달한다.

        // Scanner 내의 함수 호출시
        // -어떤 형식의 데이터를 입력받을 것인지 지정
        // -공백 문자로 분리되는 문자열 정수, 실수등

        String line = sc.next();
        int num = sc.nextInt();

        System.out.println("입력받은 문자열: " + line +  ", 입력받은 정수: " + num);



    }


}
