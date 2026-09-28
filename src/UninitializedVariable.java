public class UninitializedVariable {
    static void main() {
        int num = 1;
        System.out.println("num = "  + num);
    }
}
//변수의 생성 방법과 초기화
//클래스의 멤버 변수는 자동으로 0으로 설정.
//int num; 으로 초기화시키지않은 변수를 사용하면 오류 발생.
